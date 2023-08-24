package com.designpatterns.journaldev.creational.singleton;

/**
 * Most widley used since no need for synchronization and also it has lazy intialization.
 * Helper class will be loaded into memory only when the getInstance method is called
 */
public class StaticHelperSingleton {
    private StaticHelperSingleton(){}

    private static class Helper{
        private static final StaticHelperSingleton instance = new StaticHelperSingleton();
    }
    public static StaticHelperSingleton getInstance(){
        return Helper.instance;
    }
}
