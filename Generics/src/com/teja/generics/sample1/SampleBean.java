package com.teja.generics.sample1;

public class SampleBean {

	private String beanName;
	
	public SampleBean(String beanName){
		this.beanName = beanName;
	}
	
	
	@Override
	public String toString() {
		return "SampleBean [beanName=" + beanName + "]";
	}
	
	
}
