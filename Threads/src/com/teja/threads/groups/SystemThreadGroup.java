package com.teja.threads.groups;

public class SystemThreadGroup {

	public static void main(String[] args) {
		
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		system.list();
		Thread [] systemThreads = new Thread[system.activeCount()];
		system.enumerate(systemThreads);
		for(Thread t : systemThreads){
			System.out.println("Thread name: "+t.getName() +". Daemon: "+t.isDaemon());
		}
	}
}
