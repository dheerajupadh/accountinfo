package com.dev.getAccount.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.dev.getAccount.entity.Account;
import com.dev.getAccount.entity.AccountDetails;
import com.dev.getAccount.entity.ConsentResponse;
import com.dev.getAccount.service.FetchAccountService;
import com.dev.getAccount.service.NotFound;

@RestController
public class AccountController {


	@Autowired
	private FetchAccountService fetchAccountService;


	//Actual APi

	@PostMapping("/accountDetails")
	public List<AccountDetails> getAccountDetails(@RequestBody ConsentResponse consentResponse) {
		try {
					for(Integer i : consentResponse.getAccountNumbers()) {
						
					Optional<AccountDetails> accountDetails =	fetchAccountService.getAccountDetails(i);

					if(accountDetails.isPresent())
						if((accountDetails.get().getPsuId() == consentResponse.getPsuid())) {
							
							continue;
						}
						else {
							throw new ResponseStatusException(HttpStatus.NOT_FOUND, " Incorrect PSUID");
						}
					}
		
			List<AccountDetails> acc = new ArrayList<>();

			for(Integer i : consentResponse.getAccountNumbers()) {
				Optional<AccountDetails> accdt = fetchAccountService.getAccountDetails(i);
				if(accdt.isPresent())
				acc.add(accdt.get());
			}

			return acc;
		}catch(NotFound e){
			throw new NotFound();
		}
	}





}
