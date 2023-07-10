package com.designpatterns.udemy.john.factory;

public class Demo {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal(AnimalFactory.DOG);
        dog.speak();

        Animal cat = AnimalFactory.createAnimal((AnimalFactory.CAT));
        cat.speak();

    }
}
