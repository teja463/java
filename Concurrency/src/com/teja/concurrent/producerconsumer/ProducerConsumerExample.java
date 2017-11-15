package com.teja.concurrent.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumerExample {

	public static void main(String[] args) {
		ArrayBlockingQueue<Message> blockingQueue = new ArrayBlockingQueue<>(10);
		Thread producer = new Thread(new Producer(blockingQueue));
		Thread consumer = new Thread(new Consumer(blockingQueue));
		
		producer.start();
		consumer.start();
		
	}
}
