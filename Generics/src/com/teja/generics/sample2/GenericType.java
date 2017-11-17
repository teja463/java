package com.teja.generics.sample2;

public class GenericType<T> {

	private T t;
	
	public void setT(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}

	@Override
	public String toString() {
		return "GenericType [t=" + t + "]";
	}
	
	
}
