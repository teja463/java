package com.teja.generics.oracle;

public class BoundedType {

	public static void main(String [] args){
		Box<Integer> box = new Box<>(10);
		inspect(box.get());
	}
	
	public static <U extends Number> void inspect(U u){
		System.out.println(u.intValue());
		System.out.println(u.getClass().getName());
	}
}
