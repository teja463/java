package com.teja.lambda;

import java.util.function.Consumer;

import com.teja.vo.Person;

public class ConsumerExample {
	public static void main(String[] args) {
		
		Person person = new Person("Teja", "P", 27);
		
		printMe(p -> System.out.println(p), person);
		
		printMe(p -> System.out.println(p.getFirstName()), person);
		
		
	}
	
	public static void printMe(Consumer<Person> consumer, Person p){
		consumer.accept(p);
	}
}
