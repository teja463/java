package com.teja.generics.sample2;

public class GenericTypeDemo {

	public static void main(String[] args) {
		GenericType<String> strGen = new GenericType<String>();
		strGen.setT("Teja");
		System.out.println(strGen);
		
		
		GenericType<Integer> intGen = new GenericType<Integer>();
		intGen.setT(20);
		System.out.println(intGen);
		
		GenericType<Account> accountGen = new GenericType<Account>();
		Account account = new Account();
		account.setAccountType("GoldAccount");
		accountGen.setT(account);
		System.out.println(accountGen);
		
	}
}
