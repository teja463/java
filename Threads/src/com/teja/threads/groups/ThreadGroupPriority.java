package com.teja.threads.groups;

public class ThreadGroupPriority {

	public static void main(String[] args) {
		
		ThreadGroup group = new ThreadGroup("firstGroup");
		
		Thread t1 = new Thread(group, () -> System.out.println("t1 thread "+Thread.currentThread().getThreadGroup().getName()), "t1");
		Thread t2 = new Thread(group, "t2");
		group.setMaxPriority(3);
		
		Thread t3 = new Thread(group, "t3");
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
	}
}
