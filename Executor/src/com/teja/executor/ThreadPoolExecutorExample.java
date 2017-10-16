package com.teja.executor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyRejectExecutionHandler rejectHandler = new MyRejectExecutionHandler();
		ExecutorService executor = new ThreadPoolExecutor(2, 4, 0L, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(5), rejectHandler);
//		ExecutorService executor = Executors.newCachedThreadPool();
		
		for(int i=0; i<10; i++){
			RunnableDemo demo = new RunnableDemo(String.valueOf(i));
			executor.submit(demo);
		}
		
		executor.shutdown();
	}
}
