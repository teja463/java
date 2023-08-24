package com.designpatterns.journaldev.creational.singleton;

import java.io.Serializable;

public class SerializationSingleton implements Serializable {
    private static final SerializationSingleton instance = new SerializationSingleton();
    private SerializationSingleton(){}

    public static SerializationSingleton getInstance(){
        return instance;
    }

    protected Object readResolve(){
        return instance;
    }
}
