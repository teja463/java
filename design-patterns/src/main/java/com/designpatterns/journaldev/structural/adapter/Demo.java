package com.designpatterns.journaldev.structural.adapter;

public class Demo {

    public static void main(String[] args) {
        ToyDuck toyDuck = new PlasticToyDuck();
        Bird sparrow = new Sparrow();

        ToyDuck toyDuck1 = new BirdAdapterComposition(sparrow);
        toyDuck.squeak();
        toyDuck1.squeak();
    }
}
