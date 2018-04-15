package com.teja.generics.practice;

public class ChangePositions {

	
	public static void main(String[] args) {
		Integer [] arr = {1,2,3,4,5};
		
		print(arr);
		
		changePos(arr, 1, 2);
		
		print(arr);
	}
	
	private static <T> T[] changePos(T[] t, int pos1, int pos2){
		
		T temp = t[pos1];
		t[pos1] = t[pos2];
		t[pos2] = temp;
		return t;
	}
	
	private static <T> void print(T[] t){
		for(T temp: t){
			System.out.printf("%s ", temp);
		}
		System.out.println();
	}
}
