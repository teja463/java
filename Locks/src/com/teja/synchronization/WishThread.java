package com.teja.synchronization;

public class WishThread extends Thread{

	Wish w;
	String name;
	int start;
	int end;
	
	public WishThread(Wish w, String name, int start, int end) {
		this.w = w;
		this.name = name;
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		w.wish(name, start, end);
	}

}
