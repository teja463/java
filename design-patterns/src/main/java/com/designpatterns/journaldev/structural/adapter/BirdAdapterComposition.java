package com.designpatterns.journaldev.structural.adapter;

public class BirdAdapterComposition implements ToyDuck{

    private final Bird bird;

    public BirdAdapterComposition(Bird bird){
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}
