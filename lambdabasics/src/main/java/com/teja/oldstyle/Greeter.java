package com.teja.oldstyle;

public class Greeter {

	/*public void greeter(Greeting greeting) {
		greeting.perform();
	}*/

	public static void main(String[] args) {
//		Greeter greeter = new Greeter();

		Greeting greeting = new HelloWorldGreeting();
		greeting.perform();
		
//		greeter.greeter(greeting);
	}

}
