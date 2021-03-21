package com.dev.getAccount.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Account")

public class Account {
	
	
	@Id
	private Integer accountNumber;
	
	private String schemeName;
	
	
	private String identification;
	
	
	private String name;
	
	
	private String secondaryIdentification;
	
	
	private int balance;

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondaryIdentification() {
		return secondaryIdentification;
	}

	public void setSecondaryIdentification(String secondaryIdentification) {
		this.secondaryIdentification = secondaryIdentification;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}


	public Integer getAccountNumber() {
		return accountNumber;
	}
	
	
	public Account(Integer accountNumber, String schemeName, String identification, String name,
			String secondaryIdentification, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.schemeName = schemeName;
		this.identification = identification;
		this.name = name;
		this.secondaryIdentification = secondaryIdentification;
		this.balance = balance;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", schemeName=" + schemeName + ", identification="
				+ identification + ", name=" + name + ", secondaryIdentification=" + secondaryIdentification
				+ ", balance=" + balance + "]";
	}

	
	
	
}
