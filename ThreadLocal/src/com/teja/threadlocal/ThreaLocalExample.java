package com.teja.threadlocal;

public class ThreaLocalExample {

	public static void main(String[] args) {
		SampleThread t1 = new SampleThread("t1");
		SampleThread t2 = new SampleThread("t2");
		SampleThread t3 = new SampleThread("t3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
