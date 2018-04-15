package com.teja.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaExercise2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		numbers.forEach(e -> System.out.println(e));

		numbers.forEach(System.out::println);
		
		Double sumOfint = numbers.stream().filter(e -> e %2 == 0).map(e -> e * 2.0).reduce(0.0, (carry, ret) -> carry + ret);

	}
}
