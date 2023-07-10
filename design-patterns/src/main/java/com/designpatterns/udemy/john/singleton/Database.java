package com.designpatterns.udemy.john.singleton;

public class Database {

    private static final Database instance = new Database();


    private Database(){}

    public static Database getInstance(){
        return instance;
    }

    public void connect(){
        System.out.println("Connected");
    }
    public void disconnect(){
        System.out.println("Disconnected");
    }
    /**
     * Old way of doing a singleton class
     * this is not thread safe, so do it like above
     */
    private static Database instanceOld;
    public static Database getInstanceOld(){
        if(instanceOld == null){
            instanceOld = new Database();
        }
        return instanceOld;
    }

}
