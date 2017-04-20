package com.teja.lambda;

public class TypeInferenceExample {

	public static void main(String[] args) {
		printStringLength(s -> s.length(), "Teja");
		
		StringLength innerClass = new StringLength() {
			public int getLength( String s){
				return s.length();
			}
		};
		
		printStringLength(innerClass, "Teja2");
	}
	
	
	public  static void printStringLength(StringLength l, String str){
		System.out.println(l.getLength(str));
	}
	
	interface StringLength{
		int getLength(String s);
	}
}
