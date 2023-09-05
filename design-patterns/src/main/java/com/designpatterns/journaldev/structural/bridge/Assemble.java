package com.designpatterns.journaldev.structural.bridge;

public class Assemble implements Workshop{
    @Override
    public void work() {
        System.out.println("Assembling");
    }
}
