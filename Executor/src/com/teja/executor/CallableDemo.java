package com.teja.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CallableDemo implements Callable {

	String name;
	public CallableDemo(String name){
		this.name = name;
	}
	
	public Object call(){
		System.out.println(name+" Started");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+" Ended");
		return name.length();
	}
}
