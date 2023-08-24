package com.designpatterns.journaldev.creational.abstractfactory;

public class ComputerFactory {

    public static Computer getInstance(ComputerAbstractFactory computerAbstractFactory){
        return computerAbstractFactory.createComputer();
    }
}
