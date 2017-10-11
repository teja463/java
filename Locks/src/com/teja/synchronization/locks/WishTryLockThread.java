package com.teja.synchronization.locks;

public class WishTryLockThread extends Thread {

	WishTryLock wish;
	String name;
	
	public WishTryLockThread(WishTryLock wish, String name){
		super(name);
		this.wish = wish;
		this.name = name;
	}
	
	public void run(){
		wish.wish();
	}
}
