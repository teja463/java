package com.teja.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureExample {

	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		RunnableDemo t1 = new RunnableDemo("t1");
		RunnableDemo t2 = new RunnableDemo("t2");
		RunnableDemo t3 = new RunnableDemo("t3");
		
		pool.submit(t1);
		pool.submit(t2);
		pool.submit(t3);
		
		CallableDemo c1 = new CallableDemo("Teja");
		
		Future submit = pool.submit(c1);
//		submit.cancel(true);
		System.out.println(submit.get());
		
		pool.shutdown();
	}
	
}
