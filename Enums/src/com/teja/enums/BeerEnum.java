package com.teja.enums;

public class BeerEnum {

	enum Beer{
		KF(95), KO(90), RC(85), FO;
		
		private int price;
		
		Beer(){
			this.price = 70;
		}
		private Beer(int price){
			this.price = price;
		}
		
		public int getPrice(){
			return price;
		}
		
	}
	
	
	public class Test{
	
		public static final String NAME = "Teja"; 
	}
	
	public static void main(String[] args) {
		Beer[] beers = Beer.values();
		for(Beer beer : beers){
			System.out.println(beer.getPrice());
		}
		
		System.out.println(BeerEnum.Test.NAME);
		
	} 
	
}
