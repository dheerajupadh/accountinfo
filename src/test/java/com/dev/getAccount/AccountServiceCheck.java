package com.dev.getAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.dev.getAccount.Repository.AccountDetailsRepository;
import com.dev.getAccount.controller.AccountController;
import com.dev.getAccount.entity.AccountDetails;
import com.dev.getAccount.service.FetchAccountServiceImpl;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class AccountServiceCheck {

	
	@InjectMocks
	FetchAccountServiceImpl fetchAccountService;
	
	@Mock
	AccountDetailsRepository accountDetailsRepository;
	
	@Autowired
	AccountController accountController;
	
	@Mock
	AccountDetails accountDetails;
	
	Optional<AccountDetails> optionalAccountDetails;
	
	
	@Test
	void testGetAccountDetails() {
		
		optionalAccountDetails = Optional.of(new AccountDetails());
		
		optionalAccountDetails.get().setAccount(accountDetails.getAccount());
		optionalAccountDetails.get().setAccountNumber(accountDetails.getAccountNumber());
		optionalAccountDetails.get().setAccountSubType(accountDetails.getAccountSubType());
		optionalAccountDetails.get().setAccountType(accountDetails.getAccountType());
		optionalAccountDetails.get().setCurrency(accountDetails.getCurrency());
		optionalAccountDetails.get().setNickName(accountDetails.getNickName());
		optionalAccountDetails.get().setPsuId(accountDetails.getPsuId());
		
		
		when(accountDetailsRepository.findById(anyInt())).thenReturn(optionalAccountDetails);
		
		Optional<AccountDetails> accntDetails = fetchAccountService.getAccountDetails(accountDetails.getAccountNumber());
		
		assertEquals(accntDetails , optionalAccountDetails);
	}
	@Test
	void testGetAccountDetailsCall() {
		
optionalAccountDetails = Optional.of(new AccountDetails());
		
		optionalAccountDetails.get().setAccount(accountDetails.getAccount());
		optionalAccountDetails.get().setAccountNumber(accountDetails.getAccountNumber());
		optionalAccountDetails.get().setAccountSubType(accountDetails.getAccountSubType());
		optionalAccountDetails.get().setAccountType(accountDetails.getAccountType());
		optionalAccountDetails.get().setCurrency(accountDetails.getCurrency());
		optionalAccountDetails.get().setNickName(accountDetails.getNickName());
		optionalAccountDetails.get().setPsuId(accountDetails.getPsuId());
		when(fetchAccountService.getAccountDetails(anyInt())).thenReturn(optionalAccountDetails);
		
		Optional<AccountDetails> accntDetails = fetchAccountService.getAccountDetails(accountDetails.getAccountNumber());
		
		assertEquals(accntDetails , optionalAccountDetails);
	}
}
