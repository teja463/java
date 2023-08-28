package com.designpatterns.journaldev.structural.composite;

public class Square implements Shape{
    @Override
    public void draw(String color) {
        System.out.println("Drawing Triangle with color " + color);
    }
}
