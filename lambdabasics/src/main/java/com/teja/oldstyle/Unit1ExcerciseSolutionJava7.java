package com.teja.oldstyle;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.teja.vo.Person;

public class Unit1ExcerciseSolutionJava7 {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Teja", "P", 27), new Person("Imran", "Syed", 28),
				new Person("Pramod", "Cheekurty", 29), new Person("Srinivas", "Khandavalli", 28),
				new Person("Chaitanya", "Surya", 29));
		
		// Step 1: Sort this list by last name
		
		Collections.sort(persons, new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		
		// Step 2: Create a method that prints all values in the list
		System.out.println("********* Printing all Persons *************");
		printAllPersons(persons);
		
		// Step 3: Create a method that prints all people that have last name starting with C
		System.out.println("********* Printing Persons Last name starts with C *************");
		printConditionally(persons, new Condition(){

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
			
		});
		
		System.out.println("********* Printing Persons First name starts with T *************");
		
		printConditionally(persons, new Condition(){

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("T");
			}
			
		});
	}

	private static void printConditionally(List<Person> persons, Condition condition) {
		for(Person p : persons){
			if(condition.test(p)){
				System.out.println(p);
			}
		}
	}

	private static void printAllPersons(List<Person> persons) {
		for(Person p : persons){
			System.out.println(p);
		}
	}
	
	interface Condition{
		boolean test(Person p);
	}
}
