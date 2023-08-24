package com.designpatterns.udemy.john.abstractfactory;

public class MySqlPersonDAO implements PersonDAO{

    public Person addPerson(Person person){
        System.out.println("MySQL Person added");
        return person;
    }

    public void deletePerson(Integer id){
        System.out.println("MySQL Person deleted with id "+id);
    }
}
