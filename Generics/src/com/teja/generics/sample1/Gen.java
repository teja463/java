package com.teja.generics.sample1;

public class Gen<T> {

	T obj;

	public Gen(T ob) {
		this.obj = ob;
	}

	public void printType(){
		System.out.println("Type: "+obj.getClass().getName());
	}
	
	public T get(){
		return obj;
	}
	
}
