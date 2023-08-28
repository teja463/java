package com.designpatterns.journaldev.structural.adapter;

public class BirdAdapterInheritance extends Sparrow implements ToyDuck{
    @Override
    public void squeak() {
        makeSound();
    }
}
