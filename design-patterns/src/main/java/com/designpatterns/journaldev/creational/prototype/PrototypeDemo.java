package com.designpatterns.journaldev.creational.prototype;

import java.util.Map;

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Map<String, String> address = Map.of("city", "BLR", "country", "IN");
        Student student = new Student("Teja", "teja@gmail.com", "232323", address);

        Student studentClone = (Student) student.clone();
        System.out.println(studentClone == student);
        System.out.println(studentClone.getAddress() == student.getAddress());
    }
}
