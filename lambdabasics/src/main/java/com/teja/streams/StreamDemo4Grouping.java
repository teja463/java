package com.teja.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo4Grouping {

    public static void main(String[] args) {
	List<Person> persons = Person.getPersons();

	// Given a list of people, create a map where name is the key and value
	// is list of all people with the same name;

	Map<String, List<Person>> collect = persons.stream().collect(Collectors.groupingBy(Person::getName));

	System.out.println(collect);

	// Given a list of people, create a map where name is the key and value
	// is list of all their ages;

	Map<String, List<Integer>> collect2 = persons.stream().collect(
		Collectors.groupingBy(Person::getName, Collectors.mapping(Person::getAge, Collectors.toList())));

	System.out.println(collect2);
    }
}
