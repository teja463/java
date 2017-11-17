package com.teja.generics.sample2;

public class Account<T extends BaseAccount> {

	private T account;
	
	public Account(T account){
		this.account = account;
	}
	
	public String getAccountType(T t){
		return t.getAccountType();
	}
}
