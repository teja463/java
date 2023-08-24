package com.designpatterns.udemy.john.abstractfactory;

public interface PersonDAO {

    Person addPerson(Person person);

    void deletePerson(Integer id);
}
