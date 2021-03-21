package com.dev.getAccount.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.getAccount.Repository.AccountDetailsRepository;
import com.dev.getAccount.entity.AccountDetails;

@Service
public class FetchAccountServiceImpl implements FetchAccountService{
	
	
	
	@Autowired
	private AccountDetailsRepository accountDetailsRepository;
	
	@Override
	public Optional<AccountDetails> getAccountDetails(Integer accountNo){
		return accountDetailsRepository.findById(accountNo);
	}
	


}
