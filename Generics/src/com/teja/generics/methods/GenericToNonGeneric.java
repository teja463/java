package com.teja.generics.methods;

import java.util.ArrayList;
import java.util.List;

public class GenericToNonGeneric {

	public static void genToNonGen(List list){
		list.add(true);
		list.add(10);
		System.out.println(list);
	}
	
	public static void nonGenToGen(List<String> list){
		list.add("Teja");
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		List<String> genList = new ArrayList<>();
		genList.add("Teja");
		
		List nonGenList = new ArrayList();
		nonGenList.add(10);
		nonGenList.add(true);
		
		genToNonGen(genList);
		nonGenToGen(nonGenList);
	}
}
