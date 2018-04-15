package com.teja.generics.oracle;

public class OrderedPair<K, V> implements Pair<K, V>{
	
	K k;
	V v;
	
	public OrderedPair(K k , V v){
		this.k = k;
		this.v = v;
	}
	
	public K getKey(){
		return k;
	}
	
	public V getValue(){
		return v;
	}

	public static void main(String[] args) {
		OrderedPair<String, Integer> pair1 = new OrderedPair<>("one", 1);
		System.out.println(pair1.getKey());
		System.out.println(pair1.getValue());
		
		
		OrderedPair<String, Box<Integer>> pair2 = new OrderedPair<String, Box<Integer>>("one", new Box<>(1));
		String key = pair2.getKey();
		Box<Integer> intBox = pair2.getValue();
		
		System.out.println(intBox.get());
		
		
		Pair<String, String> strPair1 = new OrderedPair<String, String>("one", "1");
		Pair<String, String> strPair2 = new OrderedPair<String, String>("one", "1");
		
		boolean compare = comparePair(strPair1, strPair2);
		System.out.println("compare status: " + compare);
		
	}
	
	public static <K, V> boolean comparePair(Pair<K, V> pair1 ,Pair<K, V> pair2){
		return pair2.getKey().equals(pair2.getKey()) && pair1.getValue().equals(pair2.getValue());
	}
}
