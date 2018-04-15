package com.teja.generics.oracle;

public class Box<T> {
	
	T t;
	
	public Box(){
		
	}
	
	public Box(T t){
		this.t = t;
	}
	
	public void set(T t){
		this.t = t;
	}

	public T get(){
		return t;
	}
	
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>();
		intBox.set(10);
		System.out.println(intBox.get());
		
		Box<String> strBox = new Box<>();
		strBox.set("Teja");
		System.out.println(strBox.get());
		
	}
	
}
