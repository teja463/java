package com.teja.synchronization;

import java.util.concurrent.TimeUnit;

public class Wish {

	public synchronized void wish(String name, int start, int end){
		
		for(int i=start; i<end; i++){
			System.out.println(i + " Good morning: "+ name);
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
