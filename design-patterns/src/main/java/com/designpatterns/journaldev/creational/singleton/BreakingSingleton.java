package com.designpatterns.journaldev.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakingSingleton {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        EagerIntialization eager1 = EagerIntialization.getInstance();
        EagerIntialization eager2 = null;
        Constructor<?>[] constructors = EagerIntialization.class.getDeclaredConstructors();
        for(Constructor constructor: constructors){
            constructor.setAccessible(true);
            eager2 = (EagerIntialization) constructor.newInstance();
            break;
        }
        System.out.println(eager1.hashCode());
        System.out.println(eager2.hashCode());
    }


}
