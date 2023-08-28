package com.designpatterns.journaldev.structural.composite;

public class Circle implements Shape{
    @Override
    public void draw(String color) {
        System.out.println("Drawing Cricle with color "+ color);
    }
}
