package com.teja.enums;

public class EnumInnerClassDemo {

	enum Colors{
		RED, BLUE{
			public void info(){
				System.out.println("Overriden Universal Color");
			}
		}, GREEN;
		
		public void info(){
			System.out.println("Universal Color");
		}
	}
	
	public static void main(String[] args) {
		Colors[] colors = Colors.values();
		for(Colors color : colors){
			color.info();
		}
	}
}
