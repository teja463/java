package com.teja.generics.sample2;

public class AccountDemo {

	public static void main(String[] args) {
		GoldAccount goldAccount = new GoldAccount();
		goldAccount.setAccountType("Gold");
		
		Account<GoldAccount> account = new Account<GoldAccount>(goldAccount);
		System.out.println(account.getAccountType(goldAccount));
	}
}
