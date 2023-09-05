package com.designpatterns.journaldev.structural.bridge;

public class Bike extends Vehicle{

    public Bike(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manfacture() {
        System.out.println("Manufacturing Bike");
        workshop1.work();
        workshop2.work();
    }
}
