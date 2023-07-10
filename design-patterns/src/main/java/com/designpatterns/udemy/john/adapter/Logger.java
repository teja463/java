package com.designpatterns.udemy.john.adapter;

public class Logger {

    private final LogWriter writer;

    public Logger(LogWriter writer) {
        this.writer = writer;
    }

    public void logMessage(String s){
        writer.write(s);
    }
}
