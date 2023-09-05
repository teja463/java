package com.designpatterns.journaldev.structural.flyweight;

public class Line implements Shape{

    public Line(){
        try {
            System.out.println("Creating a line");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void draw(int x, int y, String color) {
        System.out.printf("Drawing line from %s %s with color %s",x,y, color);
        System.out.println();
    }
}
