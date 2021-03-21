package com.dev.getAccount;

import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;

import com.dev.getAccount.controller.AccountController;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class AccountRepositoryTest {

	
	@LocalServerPort
	private int port;
	
	@Autowired
	AccountController accountController;
	
	
	@Test
	void testGetAccountDetails() throws URISyntaxException {
		
		
	}
}
