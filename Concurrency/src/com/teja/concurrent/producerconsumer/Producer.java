package com.teja.concurrent.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {

	ArrayBlockingQueue<Message> blockingQueue;

	public Producer(ArrayBlockingQueue<Message> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				Message m = new Message("Produced: " + i, i);
				blockingQueue.put(m);
				System.out.println("Produced: " + i);
				TimeUnit.MILLISECONDS.sleep(100);
			}
			blockingQueue.put(new Message("", -1));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
