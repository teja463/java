package com.teja.threads.groups;

public class ThreadGroupMethods {

	public static void main(String[] args) throws InterruptedException {

		ThreadGroup parentGroup = new ThreadGroup("parentGroup");
		ThreadGroup childGroup = new ThreadGroup(parentGroup, "childGroup");

		Runnable r = () -> {
			System.out.println(Thread.currentThread().getName() +" running. Group: " +Thread.currentThread().getThreadGroup().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Thread t1 = new Thread(parentGroup, r, "ChildThread1");
		Thread t2 = new Thread(parentGroup, r, "ChildThread2");
		t1.start();
		t2.start();
		
		System.out.println("ThreadGroup active threads:"+parentGroup.activeCount());
		System.out.println("ThreadGropu acitve group count: "+parentGroup.activeGroupCount());
		parentGroup.list();
		
		Thread.sleep(6000);
		
		System.out.println("ThreadGroup active threads:"+parentGroup.activeCount());
		System.out.println("ThreadGropu acitve group count: "+parentGroup.activeGroupCount());
		parentGroup.list();
		
	}
	
}
