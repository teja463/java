package com.teja.streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemo1Map {

	public static void main(String[] args) {
		
		// 
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		// Normal foreach loop
		
		numbers.forEach(e -> {
			if( e %2 == 0){
				System.out.println(e);
			}
		});
		
		
		// With streams
		System.out.println(numbers.stream().filter(e -> e % 2 == 0).map(e -> e).count());
	}
}
