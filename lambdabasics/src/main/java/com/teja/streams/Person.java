package com.teja.streams;

import java.util.Arrays;
import java.util.List;

import com.teja.streams.Person.Gender;

class Person {

    enum Gender {
	MALE, FEMALE;
    };

    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
    }

    @Override
    public String toString() {
	return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public Gender getGender() {
	return gender;
    }

    public void setGender(Gender gender) {
	this.gender = gender;
    }
    
    public static List<Person> getPersons() {
	List<Person> persons = Arrays.asList(new Person("Teja", 28, Gender.MALE), new Person("Teja", 29, Gender.MALE),
		new Person("Ramya", 28, Gender.FEMALE), new Person("Pramod", 30, Gender.MALE),
		new Person("Imran", 28, Gender.MALE));

	return persons;
    }


}