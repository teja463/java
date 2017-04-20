package com.teja.lambda;

import com.teja.oldstyle.Greeting;

public class LambdaGreet {

	public static void main(String[] args) {
		Greeting greeting = () -> System.out.println("Hello World!! ");
		
		greeting.perform();
	}
}
