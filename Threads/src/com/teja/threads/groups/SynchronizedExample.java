package com.teja.threads.groups;

public class SynchronizedExample {

	public static void main(String[] args) {

		SynchronizedThread r = new SynchronizedThread();
		
		Thread t1 = new Thread(r, "t1");
		Thread t2 = new Thread(r, "t2");
		
		t1.start();
		t2.start();
		
	}
	
}
