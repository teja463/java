package com.teja.lambda;

public class AdditionLambda {

	public static void main(String[] args) {
		add((a, b) -> {
			if (a > 10 && b > 10)
				return a + b;
			else
				return 0;
		});

	}

	static void add(Addition addition) {
		System.out.println(addition.add(20, 20));
	}
}
