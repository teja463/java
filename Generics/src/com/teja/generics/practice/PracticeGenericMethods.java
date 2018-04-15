package com.teja.generics.practice;

import java.util.Date;

public class PracticeGenericMethods {

	@SuppressWarnings("unchecked")
	public static <T> T get(T t){
		System.out.println(t.getClass());
		return (T) t.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(get(1));
		System.out.println(get("Teja"));
		System.out.println(get(new Date()));
	}
	
	
}
