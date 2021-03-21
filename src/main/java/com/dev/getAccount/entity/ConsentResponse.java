package com.dev.getAccount.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ConsentResponse {

		
	private String status;
	
	private String consentResponseId;
	
	private Integer psuid;

	
	private List<Integer> accountNumbers;



	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getConsentResponseId() {
		return consentResponseId;
	}

	public void setConsentResponseId(String consentResponseId) {
		this.consentResponseId = consentResponseId;
	}

	public Integer getPsuid() {
		return psuid;
	}

	public void setPsuid(Integer psuid) {
		this.psuid = psuid;
	}

	public List<Integer> getAccountNumbers() {
		return accountNumbers;
	}

	public void setAccountNumbers(List<Integer> accountNumbers) {
		this.accountNumbers = accountNumbers;
	}

	public ConsentResponse(String status, String consentResponseId, Integer psuid,
			String consentRequestId, List<Integer> accountNumbers) {
		super();
		this.status = status;
		this.consentResponseId = consentResponseId;
		this.psuid = psuid;
		this.accountNumbers = accountNumbers;
	}
	
	public ConsentResponse() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ConsentResponse [status=" + status + ", consentResponseId=" + consentResponseId + ", psuid=" + psuid
				+ ", accountNumbers=" + accountNumbers + "]";
	}


	
	
	
	
}
