package com.designpatterns.journaldev.creational.builder;

public class Demo {

    public static void main(String[] args) {
        Computer laptop = new Computer.ComputerBuilder("16GB", "1TB").build();
        Computer desktop = new Computer.ComputerBuilder("8GB", "512GB").keyboard("Dell").mouse("Dell").build();

        System.out.println(laptop);
        System.out.println(desktop);
    }
}
