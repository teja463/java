package com.teja.innerclasses;

import com.teja.oldstyle.Greeting;

public class InnerClassGreet {

		
	public static void main(String[] args) {
		Greeting greet = new Greeting() {
			
			public void perform(){
				System.out.println("Hello Wolrd!! ");
			}
		};
		
		greet.perform();
	}
}
