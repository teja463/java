package com.teja.lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		checkEven(a -> {
			if(a%2 == 0 ){
				System.out.println("Its an even number ");
				return true;
			}else{
				System.out.println("its not an even number");
				return false;
			}
		});
		
		isSumEven(
				(a, b) -> {
					return ( a +b )%2 == 0; 
				}
		);
	}
	
	public static void checkEven(Predicate<Integer> predicate){
		predicate.test(3);
	}
	
	public static void isSumEven(BiPredicate<Integer, Integer> predicate){
		if(predicate.test(5, 5)){
			System.out.println("Sum is even");
		}else{
			System.out.println("Sum is not even");
		}
	}
}
