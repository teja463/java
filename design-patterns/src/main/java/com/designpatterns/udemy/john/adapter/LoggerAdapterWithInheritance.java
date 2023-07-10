package com.designpatterns.udemy.john.adapter;

public class LoggerAdapterWithInheritance extends ConsoleWriter implements LogWriter{

    @Override
    public void write(String s) {
        writeToConsole(s);
    }
}
