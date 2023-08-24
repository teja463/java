package com.designpatterns.journaldev.creational.factory;

public class Demo {

    public static void main(String[] args) {
        Computer i5 = ComputerFactory.getInstance(ComputerFactory.DESKTOP, "12GB", "1TB", "i5");
        System.out.println(i5.getRam());
    }
}
