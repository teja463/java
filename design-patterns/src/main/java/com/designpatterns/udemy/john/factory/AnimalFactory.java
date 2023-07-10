package com.designpatterns.udemy.john.factory;

public abstract class AnimalFactory {

    public static final int DOG = 1;
    public static final int CAT = 2;

    public static Animal createAnimal(int animalType) {
        switch (animalType) {
            case DOG -> {
                return new Dog();
            }
            case CAT -> {
                return new Cat();
            }
            default -> throw new IllegalStateException("Cant create a animal for give type");
        }
    }
}
