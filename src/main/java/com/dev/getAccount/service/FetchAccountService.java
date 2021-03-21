package com.dev.getAccount.service;

import java.util.Optional;

import com.dev.getAccount.entity.AccountDetails;

public interface FetchAccountService {


	
	public Optional<AccountDetails> getAccountDetails(Integer accountNo);
	

	
}
