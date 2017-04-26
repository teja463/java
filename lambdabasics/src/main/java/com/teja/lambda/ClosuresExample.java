package com.teja.lambda;

public class ClosuresExample {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		doProcess(a, i -> System.out.println(a + b));
	}
	
	public static void doProcess(int i, Process p){
		p.process(i);
	}
}

