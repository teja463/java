package com.teja.generics.methods;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodDemo2 {

	
	public static <T> T addAndReturn(T t, List<T> list){
		list.add(t);
		return t;
	}
	
	public static void main(String[] args) {
		List<String> sList =  new ArrayList<>();
		addAndReturn("Teja", sList);
		System.out.println(sList);
		
		List<Integer> iList =  new ArrayList<>();
		addAndReturn(10, iList);
		System.out.println(iList);
	}
}
