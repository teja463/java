package com.teja.threads.groups;

public class ThreadExample {
	
	
	public static void main(String[] args) {
		
		/**
		 * Every thread in java belongs to a thread group.
		 * Every java class has a thread called main thread which belongs to the threadgroup called main.
		 * main threadgroup is a subgroup of a system threadgroup.
		 * system is the root group.
		 * system has some threads called garbage collector, and etc
		 */
		
		System.out.println("Thread name :"+Thread.currentThread().getName());
		System.out.println("Thread group: "+Thread.currentThread().getThreadGroup().getName());
		System.out.println("Thread group parent :"+Thread.currentThread().getThreadGroup().getParent().getName());
	}
}
