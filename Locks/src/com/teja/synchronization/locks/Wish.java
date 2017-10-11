package com.teja.synchronization.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Wish {

	ReentrantLock lock  = new ReentrantLock();
	public void wish(String name, int start, int end){
		lock.lock();
		for(int i=start; i<end; i++){
			System.out.println(i + " Good morning: "+ name);
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		lock.unlock();
	}
}
