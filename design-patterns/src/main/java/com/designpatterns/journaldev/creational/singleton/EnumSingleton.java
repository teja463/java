package com.designpatterns.journaldev.creational.singleton;

/**
 * Simple way to create singleton, instead of thread safe and double null checking synchronized blocks
 * But no lazy intializtion
 */
public enum EnumSingleton {
    INSTANCE;

    public static void doSomething(){
        System.out.println("Something!!");
    }

    public void another(){
        System.out.println("Another");
    }
}
