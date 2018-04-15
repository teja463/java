package com.teja.streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemo2Reduce {

    public static void main(String[] args) {

	// Sum Demo

	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	System.out.println(
		numbers.stream().filter(e -> e % 2 == 0).map(e -> e * 2).reduce(0, (carry, ret) -> carry + ret));

    }
}
