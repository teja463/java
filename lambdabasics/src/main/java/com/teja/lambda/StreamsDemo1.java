package com.teja.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamsDemo1 {

    public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	Integer sumOfEvanSquares = numbers.stream().filter(e -> e % 2 == 0).map(e -> e * e).reduce(0,
		(carry, ret) -> carry + ret);

	Integer sumOfEvanSquares2 = numbers.stream().filter(StreamsDemo1::filterOdds).map(StreamsDemo1::doubleVal)
		.reduce(0, (carry, ret) -> carry + ret);

	System.out.println(sumOfEvanSquares);
	System.out.println(sumOfEvanSquares2);

    }

    public static boolean filterOdds(Integer val) {
	return val % 2 == 0;
    }

    public static Integer doubleVal(Integer val) {
	return val * val;
    }

}
