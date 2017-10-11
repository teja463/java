package com.teja.synchronization.locks;

public class WishTryLockDemo {

	public static void main(String[] args) {
		WishTryLock wish = new WishTryLock();
		WishTryLockThread t1 = new WishTryLockThread(wish, "t1");
		WishTryLockThread t2 = new WishTryLockThread(wish, "t2");
		
		t1.start();
		t2.start();
	}
}
