package com.teja.synchronization.locks;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

	public static void main(String[] args) {
		ReentrantLock l = new ReentrantLock();
		l.lock();
		l.lock();
		try{
			System.out.println("Hold count: "+l.getHoldCount());
			System.out.println("Is held by current thread? "+l.isHeldByCurrentThread());
			l.unlock();
			System.out.println("Hold count: "+l.getHoldCount());
			System.out.println("Is held by current thread? "+l.isHeldByCurrentThread());
		}finally{
			l.unlock();
		}
	}
}
