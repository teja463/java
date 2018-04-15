package com.teja.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.teja.streams.Person.Gender;;

public class StreamDemo3Collectors {

    public static void main(String[] args) {
	
	// Collectors Demo
	
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	List<Integer> evens = numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

	System.out.println(evens);
	
	List<Person> persons = Person.getPersons();
	
	List<Person> males = persons.stream().filter(p -> p.getGender() == Gender.MALE).collect(Collectors.toList());
	
	System.out.println(males);
	
	
	// Create a map of persons with key as their name and value as the person object.
	
	Map<String, Person> personNameMap = persons.stream().collect(Collectors.toMap(p -> p.getName() + p.getAge(), p -> p));
	
	System.out.println(personNameMap);
    }


}
