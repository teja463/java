package com.teja.generics.practice;

public class GenericPrint {

	public static void main(String [] args){
		Integer [] ints = {1,2,3,4,5};
		String [] strings = {"a","b","c","d","e"};
		
		printIntegers(ints);
		
		printStrings(strings);
		
		printAnyThing(ints);
		printAnyThing(strings);
	}
	
	private static <T> void printAnyThing(T [] ts){
		for(T t: ts ){
			System.out.println("Generic: " +t);
		}
	}
	
	private static void printIntegers(Integer [] ints){
		for (Integer i : ints){
			System.out.println("Non generic: " +i);
		}
	}
	
	private static void printStrings(String [] strings){
		for(String s: strings){
			System.out.println("Non generic: "+s);
		}
	}
}
