package com.dev.getAccount;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.dev.getAccount.entity.AccountDetails;
import com.dev.getAccount.entity.ConsentResponse;
import com.dev.getAccount.service.FetchAccountServiceImpl;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class GetAccountControllerTests {

	@Autowired
	private WebApplicationContext webApplicationContext;

	@MockBean
	private FetchAccountServiceImpl fetchAccountServiceImpl;
	
	private MockMvc mockMvc;
	@MockBean
	private ConsentResponse consentResponse;
	@MockBean
	private Optional<AccountDetails> accountDetails;
	@BeforeEach
	public void setup() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
	}


	@Test
	void testGetAccountDetails() throws Exception {
		when(accountDetails.isPresent()).thenReturn(true);
		this.mockMvc
	    .perform(
	      post("/accountDetails")
	        .contentType(MediaType.APPLICATION_JSON)
	        .content("{\n" + 
	        		"    \"status\":\"AUTHORIZED\",\n" + 
	        		"    \"consentResponseId\":\"1d1bc361-db6e-4a5a-a669-66bba0f21282\",\n" + 
	        		"    \"psuid\":\"51\",\n" + 
	        		"      \"accountNumbers\": [\n" + 
	        		"        1001,\n" + 
	        		"        1002\n" + 
	        		"    ]\n" + 
	        		"\n" + 
	        		"}")
	        
	    )
	    .andExpect(status().isOk());

	}

}
