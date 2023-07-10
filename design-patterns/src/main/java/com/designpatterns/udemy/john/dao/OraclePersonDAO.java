package com.designpatterns.udemy.john.dao;

public class OraclePersonDAO implements PersonDAO{

    public Person addPerson(Person person){
        System.out.println("Orace Person added");
        return person;
    }

    public void deletePerson(Integer id){
        System.out.println("Orace Person deleted with id "+id);
    }
}
