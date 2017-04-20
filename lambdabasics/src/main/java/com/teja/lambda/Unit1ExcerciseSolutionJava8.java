package com.teja.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.teja.vo.Person;

public class Unit1ExcerciseSolutionJava8 {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Teja", "P", 27), new Person("Imran", "Syed", 28),
				new Person("Pramod", "Cheekurty", 29), new Person("Srinivas", "Khandavalli", 28),
				new Person("Chaitanya", "Surya", 29));

		// Step 1: Sort this list by last name

		Collections.sort(persons, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step 2: Create a method that prints all values in the list

		System.out.println("********* Printing all Persons *************");

		printConditionally(persons, p -> true);

		// Step 3: Create a method that prints all people that have last name starting with C

		System.out.println("********* Printing Persons Last name starts with C *************");

		printConditionally(persons, p -> p.getLastName().startsWith("C"));

		System.out.println("********* Printing Persons First name starts with T *************");

		printConditionally(persons, p -> p.getFirstName().startsWith("T"));
	}

	private static void printConditionally(List<Person> persons, Condition condition) {
		for (Person p : persons) {
			if (condition.test(p))
				System.out.println(p);
		}
	}

	interface Condition {
		boolean test(Person p);
	}
}
