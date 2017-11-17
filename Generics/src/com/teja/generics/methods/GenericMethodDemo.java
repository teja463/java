package com.teja.generics.methods;

public class GenericMethodDemo {

	public static <T> void show(T t){
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		String str = "Test..";
		show(str);
		
	}
}
