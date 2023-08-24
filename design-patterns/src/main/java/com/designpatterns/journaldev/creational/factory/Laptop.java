package com.designpatterns.journaldev.creational.factory;

public class Laptop implements Computer{

    private String ram;
    private String hdd;
    private String processor;

    public Laptop(String ram, String hdd, String processor) {
        this.ram = ram;
        this.hdd = hdd;
        this.processor = processor;
    }

    @Override
    public String getRam() {
        return ram;
    }

    @Override
    public String getHdd() {
        return hdd;
    }

    @Override
    public String getProcessor() {
        return processor;
    }
}
