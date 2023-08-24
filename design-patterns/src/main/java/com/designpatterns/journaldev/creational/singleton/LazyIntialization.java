package com.designpatterns.journaldev.creational.singleton;

/**
 * Lazy intialization good for resource heavy classes, but it is not thread safe
 * If multiple threads same method then it breaks singleton
 */
public class LazyIntialization {
    private static LazyIntialization instance;

    private LazyIntialization(){}

    public static LazyIntialization getInstance(){
        if(null == instance){
            instance = new LazyIntialization();
        }
        return instance;
    }
}
