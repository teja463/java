package com.teja.lambda;

public class RunnableExample {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				System.out.println("Hello World from thread "+Thread.currentThread().getName());
			}
		}, "innerThread");
		
		t1.start();
		
		Thread t2 = new Thread ( () -> System.out.println( "Hello World from thread "+Thread.currentThread().getName() ), "Lambda Thread" );
		
		t2.start();
	}
}
