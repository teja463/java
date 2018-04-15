package com.teja.generics.oracle;

public class FindBigNumbersCount {

	public static void main(String[] args) {
		
		Integer arr [] = {1,2,3,4,5,6,7,8,9,10};

		System.out.println(countNums(arr, 5));
		System.out.println(countNums2(arr, 5));
		
	}
	
	private static <T extends Comparable<T>> int countNums(T[] arr, T elem){
		int count = 0;
		for(T temp : arr){
			if (temp.compareTo(elem) > 0){
				count++;
			}
		}
		return count;
	}
	
	private static <T extends Number>int countNums2(T[] arr, T elem){
		int count = 0;
		for (T temp: arr){
			count += temp.intValue() > elem.intValue() ?1:0;
		}
		return count;
	}
}
