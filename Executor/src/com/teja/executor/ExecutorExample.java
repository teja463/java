package com.teja.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		
		pool.submit(() -> {
			System.out.println("Start: "+Thread.currentThread().getName());
//			System.out.println("processing first thread");
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("End: "+Thread.currentThread().getName());
		});
		
		pool.submit(() -> {
			System.out.println("Start: "+Thread.currentThread().getName());
//			System.out.println("processing second thread");
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("End: "+Thread.currentThread().getName());
		});		
		
		for(int i=0; i<10; i++)
		
		pool.submit(() -> {
			System.out.println("Start: "+Thread.currentThread().getName());
//			System.out.println("processing second thread");
			try {
				TimeUnit.SECONDS.sleep(70);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("End: "+Thread.currentThread().getName());
		});		
		
		
		pool.shutdown();
	}
}
