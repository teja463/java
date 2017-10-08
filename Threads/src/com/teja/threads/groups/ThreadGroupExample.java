package com.teja.threads.groups;

public class ThreadGroupExample {

	public static void main(String[] args) {
		
		ThreadGroup group1 = new ThreadGroup("firstGroup");
		System.out.println(group1.getParent().getName());
		
		ThreadGroup group2 = new ThreadGroup(group1, "secondGroup");
		System.out.println(group2.getParent());
		
		
	}
}
