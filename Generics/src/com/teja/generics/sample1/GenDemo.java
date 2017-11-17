package com.teja.generics.sample1;

public class GenDemo {

	public static void main(String[] args) {
		
		Gen<String> strGen = new Gen<String>("Teja");
		System.out.println(strGen.get());
		strGen.printType();
		
		Gen<SampleBean> beanGen = new  Gen<SampleBean>(new SampleBean("SampleBean"));
		System.out.println(beanGen.get());
		beanGen.printType();
		
	}
}
