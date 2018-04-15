package com.teja.generics.oracle;

import java.util.Comparator;

public class Wildcards<T> implements Comparator<T>{

	T t;
	
	public void set(T t){
		this.t = t;
	}
	
	public T get(){
		return t;
	}
	
	public static void wildCardTest(Wildcards<? extends Number> t){
		System.out.println(t.get());
	}
	
	public static void withoutWildCard(Wildcards<Number> t){
		System.out.println(t.get());
	}
	public static void main(String[] args) {
		
		Wildcards<Number> wildNum = new Wildcards<>();
		wildNum.set(10);

		Wildcards<Integer> wildInt = new Wildcards<>();
		wildInt.set(10);
		
		wildCardTest(wildNum);
		wildCardTest(wildInt);
		
		withoutWildCard(wildNum);
//		withoutWildCard(wildInt); This does not work because you re restricting the type only to number not its sub classes
		
	}

	@Override
	public int compare(T o1, T o2) {
		
		return 0;
	}
}
