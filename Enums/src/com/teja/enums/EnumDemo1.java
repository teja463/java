package com.teja.enums;

public class EnumDemo1 {

	enum Days {

		MONDAY("mon"), TUESDAY("tue");
		
		private String day;
		
		private Days(String day){
			this.day = day;
		}
		
		private String getDay(){
			return day;
		}
	}

	public static void main(String[] args) {
		Days mon = Days.valueOf("MONDAY");
		Days tue = Days.TUESDAY;
		String day = Days.TUESDAY.getDay();
		System.out.println(mon);
		System.out.println(day);
	}
}
