package com.teja.generics.methods;

import java.util.ArrayList;
import java.util.List;

public class GenericWildcardMethod {

	private static void genericMethod(List<? extends Number> list){
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		/*List<String> l = new ArrayList<>();
		l.add("Teja");
		genericMethod(l);*/
		
		List<Integer> ll = new ArrayList<>();
		ll.add(10);
		genericMethod(ll);
	}
}
