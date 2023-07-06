package com.designpatterns.singleton;

public class Demo01 {
    public static void main(String[] args) {
        Database db = Database.getInstance();
        Database db2 = Database.getInstance();

        System.out.println(db.equals(db2));
        db.connect();
        db.disconnect();
    }
}
