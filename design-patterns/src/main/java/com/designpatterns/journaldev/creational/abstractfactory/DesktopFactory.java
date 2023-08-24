package com.designpatterns.journaldev.creational.abstractfactory;

public class DesktopFactory implements ComputerAbstractFactory{

    private String ram;
    private String hdd;
    private String processor;

    public DesktopFactory(String ram, String hdd, String processor) {
        this.ram = ram;
        this.hdd = hdd;
        this.processor = processor;
    }

    @Override
    public Computer createComputer() {
        return new Desktop(ram, hdd, processor);
    }
}
