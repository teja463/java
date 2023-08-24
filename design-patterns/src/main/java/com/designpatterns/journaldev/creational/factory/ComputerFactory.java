package com.designpatterns.journaldev.creational.factory;

public class ComputerFactory {

    public static final int LAPTOP = 1;
    public static final int DESKTOP = 2;

    public static Computer getInstance(int type, String ram, String hdd, String processor){
        return switch (type){
            case LAPTOP -> new Laptop(ram, hdd, processor);
            case DESKTOP -> new Desktop(ram, hdd, processor);
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
