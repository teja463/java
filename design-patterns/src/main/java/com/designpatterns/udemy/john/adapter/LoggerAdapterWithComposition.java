package com.designpatterns.udemy.john.adapter;

public class LoggerAdapterWithComposition implements LogWriter{

    private final ConsoleWriter writer = new ConsoleWriter();

    @Override
    public void write(String s) {
        writer.writeToConsole(s);
    }
}
