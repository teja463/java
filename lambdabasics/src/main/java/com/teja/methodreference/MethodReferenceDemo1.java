package com.teja.methodreference;

import java.util.Arrays;
import java.util.List;

import com.teja.vo.Person;

public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Teja", "P", 28), new Person("Pramod", "Ch", 28),
				new Person("Imran", "Syed", 28), new Person("Chaitu", "P", 28), new Person("Seenu", "K", 28));
		
		persons.stream()
		.filter(p -> p.getLastName().startsWith("P"))
		.forEach(p -> System.out.println(p.getFirstName()));
		
		persons.forEach(p -> System.out.println(p.getFirstName()));
		
		System.out.println("-----------------");
		
		persons.forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(numbers.stream().reduce(0, (total,e) -> Integer.sum(total, e)));
		
		System.out.println(numbers.stream().reduce(0, Integer::sum));
	}
}
