package com.designpatterns.journaldev.creational.singleton;

/**
 * The instance is created during the class load itself and scope for exception handling.
 * If the class is not used much and if it is heavy like using file/db resources then eager intialization is not good.
 */
public class EagerIntialization {
    private static final EagerIntialization instance = new EagerIntialization();
    public static EagerIntialization getInstance(){
        return instance;
    }
    private EagerIntialization(){}
}
