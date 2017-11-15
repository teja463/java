package com.teja.concurrent.producerconsumer;

public class Message {

	private String name;
	private int id;
	
	public Message(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
}
