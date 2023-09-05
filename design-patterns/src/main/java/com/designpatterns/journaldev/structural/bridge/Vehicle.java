package com.designpatterns.journaldev.structural.bridge;

public abstract class Vehicle {

    protected final Workshop workshop1;
    protected final Workshop workshop2;

    public Vehicle(Workshop workshop1, Workshop workshop2) {
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    public abstract void manfacture();
}
