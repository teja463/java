package com.designpatterns.journaldev.creational.singleton;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class User implements Serializable {

    private String name;
    private String password;

    private void writeObject(ObjectOutputStream out) throws IOException {
        this.password = "hash-"+password;
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in ) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.password = password.substring(5);
    }

}
