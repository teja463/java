package com.teja.threadlocal;

import java.util.Random;

public class SampleThread extends Thread {

	private static Random random = new Random();
	
	public SampleThread(String name){
		super(name);
	}
	
	public void run(){
		String threadName = Thread.currentThread().getName();
		MyThreadLocal.local.get().put(threadName, Thread.currentThread().getId());
		int i =random.nextInt(10);
		String key = null;
		String val = null;
			
		if(random.nextInt(10)>5){
			key = threadName+String.valueOf(i);
			val = threadName+" Greater than 5";;
			MyThreadLocal.local.get().put(key, val);
		}/*else{
			key = threadName+String.valueOf(i);
			val = threadName+" Less than 5";;
		}*/
		System.out.println("Thread: "+ threadName+" size is: "+MyThreadLocal.local.get().size());
//		MyThreadLocal.printAll();
	}
}
