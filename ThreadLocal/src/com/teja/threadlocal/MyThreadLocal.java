package com.teja.threadlocal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyThreadLocal {

	public static ThreadLocal<Map<String, Object>> local = new ThreadLocal<Map<String, Object>>() {

		protected Map<String, Object> initialValue() {
			return new HashMap<String, Object>();
		}
	};

	
	public static void printAll(){
		Iterator<String> iterator = local.get().keySet().iterator();
		while(iterator.hasNext()){
			String key = iterator.next();
			System.out.println("Key: " +key +" Value: "+local.get().get(key));
		}
	}
}
