package com.designpatterns.udemy.john.adapter;

public class Demo {

    public static void main(String[] args) {

        LoggerAdapterWithComposition adapter1 = new LoggerAdapterWithComposition();
        Logger logger1 = new Logger(adapter1);
        logger1.logMessage("Sample");

        LoggerAdapterWithInheritance adapter2 = new LoggerAdapterWithInheritance();
        Logger logger2 = new Logger(adapter2);
        logger2.logMessage("Sample 2");
    }
}
