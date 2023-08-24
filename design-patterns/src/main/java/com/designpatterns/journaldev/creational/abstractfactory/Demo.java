package com.designpatterns.journaldev.creational.abstractfactory;

public class Demo {

    public static void main(String[] args) {
        Computer desktop = ComputerFactory.getInstance(new DesktopFactory("12GB", "128GB", "i5"));
        System.out.println(desktop.getProcessor());

        Computer laptop = ComputerFactory.getInstance(new LaptopFactory("8GB", "256GB", "i7"));
        System.out.println(laptop.getProcessor());
    }
}
