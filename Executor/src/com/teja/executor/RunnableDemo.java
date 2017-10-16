package com.teja.executor;

import java.util.concurrent.TimeUnit;

public class RunnableDemo implements Runnable{

	String name;
	public RunnableDemo(String name){
		this.name = name;
	}
	
	public void run(){
		System.out.println(name+" Started");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name+" Ended");
	}
}
