package com.designpatterns.udemy.john.dao;

public interface PersonDAO {

    Person addPerson(Person person);

    void deletePerson(Integer id);
}
