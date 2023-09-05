package com.designpatterns.journaldev.structural.bridge;

public class Demo {

    public static void main(String[] args) {
        Workshop assemble = new Assemble();
        Workshop produce = new Produce();

        Vehicle car = new Car(assemble, produce);
        car.manfacture();

        Bike bike = new Bike(assemble, produce);
        bike.manfacture();
    }
}
