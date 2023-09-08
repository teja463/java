package com.designpatterns.journaldev.structural.decorator;

public class Demo {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        Car luxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));
        luxuryCar.assemble();
    }
}
