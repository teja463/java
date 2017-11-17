package com.teja.generics.sample2;

public class Account {

	private String accountType;
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getAccountType() {
		return accountType;
	}

	@Override
	public String toString() {
		return accountType;
	}
	
	
}
