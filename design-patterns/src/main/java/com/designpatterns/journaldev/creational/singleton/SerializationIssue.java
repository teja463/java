package com.designpatterns.journaldev.creational.singleton;

import java.io.*;

public class SerializationIssue {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializationSingleton eager1 = SerializationSingleton.getInstance();

        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(eager1);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SerializationSingleton eager2 = (SerializationSingleton)in.readObject();
        in.close();

        System.out.println(eager1.hashCode());
        System.out.println(eager2.hashCode());

    }
}
