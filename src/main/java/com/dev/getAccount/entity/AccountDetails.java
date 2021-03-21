package com.dev.getAccount.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "AccountDetails")
public class AccountDetails {

	@Id
	private Integer accountNumber;
	
	
	private Integer psuId;
	
	
	private String currency;
	
	
	private String nickName;
	
	
	private String accountType;
	
	
	private String accountSubType;
	
	@DBRef
	private Account account;

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Integer getPsuId() {
		return psuId;
	}

	public void setPsuId(Integer psuId) {
		this.psuId = psuId;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountSubType() {
		return accountSubType;
	}

	public void setAccountSubType(String accountSubType) {
		this.accountSubType = accountSubType;
	}



	public AccountDetails(Integer accountNumber, Integer psuId, String currency, String nickName, String accountType,
			String accountSubType) {
		super();
		this.accountNumber = accountNumber;
		this.psuId = psuId;
		this.currency = currency;
		this.nickName = nickName;
		this.accountType = accountType;
		this.accountSubType = accountSubType;
		
	}
	
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public AccountDetails() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber + ", psuId=" + psuId + ", currency=" + currency
				+ ", nickName=" + nickName + ", accountType=" + accountType + ", accountSubType=" + accountSubType
				+ ", account=" + account + "]";
	}

	public AccountDetails(Integer accountNumber, Integer psuId, String currency, String nickName, String accountType,
			String accountSubType, Account account) {
		super();
		this.accountNumber = accountNumber;
		this.psuId = psuId;
		this.currency = currency;
		this.nickName = nickName;
		this.accountType = accountType;
		this.accountSubType = accountSubType;
		this.account = account;
	}

	





	
	
}
