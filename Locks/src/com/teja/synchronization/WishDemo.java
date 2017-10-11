package com.teja.synchronization;

public class WishDemo {

	public static void main(String[] args) {
		Wish w = new Wish();
		WishThread t1 = new WishThread(w, "Teja", 1, 5);
		WishThread t2 = new WishThread(w, "Imran", 6, 10);
		
		Long start = System.currentTimeMillis();
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Total time: "+(System.currentTimeMillis()-start));
	}
}
