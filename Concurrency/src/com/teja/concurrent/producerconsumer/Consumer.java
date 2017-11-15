package com.teja.concurrent.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable{

	ArrayBlockingQueue<Message> blockingQueue;
	
	public Consumer(ArrayBlockingQueue<Message> blockingQueue){
		this.blockingQueue = blockingQueue;
	}
	
	public void run(){
		try {
			Message message = blockingQueue.take();
			while(message.getId()!=-1){
				System.out.println("Consumed: "+message.getId());
				message = blockingQueue.take();
				TimeUnit.MILLISECONDS.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
