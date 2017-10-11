package com.teja.synchronization.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class WishTryLock{

	ReentrantLock lock = new ReentrantLock();
	
	public void wish(){
		do{
			try {
				if(lock.tryLock(1, TimeUnit.SECONDS)){
					System.out.println(Thread.currentThread().getName() +" got the lock");
					TimeUnit.SECONDS.sleep(5);
					System.out.println("Releasing the lock: ");
					lock.unlock();
					break;
				}else{
					System.out.println(Thread.currentThread().getName() +" did not get the lock, will try again");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}while(true);
	}
}
