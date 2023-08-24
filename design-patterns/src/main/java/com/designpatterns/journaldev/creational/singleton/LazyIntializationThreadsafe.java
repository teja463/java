package com.designpatterns.journaldev.creational.singleton;

/**
 * Its better to synchronize only the code block where instace is getting created instead of synchronizing whole method
 * Reason is intialization only happens only once for that why to synchronize whole method when multiple threads are accessing getInstance
 * If we synchronize only block where instance is created it will be faster since we are not sychronizing whole method
 */
public class LazyIntializationThreadsafe {

    private static LazyIntializationThreadsafe instance;
    private LazyIntializationThreadsafe(){}

    public static LazyIntializationThreadsafe getInstance(){
        if(instance == null){
            synchronized (LazyIntializationThreadsafe.class){
                if(instance == null){
                    instance = new LazyIntializationThreadsafe();
                }
            }
        }
        return instance;
    }

}
