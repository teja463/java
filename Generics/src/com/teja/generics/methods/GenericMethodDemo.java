package com.teja.generics.methods;

import com.teja.generics.sample2.BaseAccount;
import com.teja.generics.sample2.GoldAccount;

public class GenericMethodDemo {

	public static <T> void show(T t){
		System.out.println(t);
	}
	
	public static <T extends BaseAccount> String get(T t){
		return t.getAccountType();
	}
	
	public static void main(String[] args) {
		String str = "Test..";
		show(str);
		
		BaseAccount account = new GoldAccount();
		account.setAccountType("Gold");
		System.out.println(get(account));
	}
}
