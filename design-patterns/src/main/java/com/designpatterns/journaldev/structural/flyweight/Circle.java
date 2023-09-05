package com.designpatterns.journaldev.structural.flyweight;

public class Circle implements Shape{

    private final boolean isFill;

    public Circle(boolean isFill) {
        this.isFill = isFill;
        try {
            System.out.println("Creating a circle object with fill " + isFill);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(int x, int y, String color) {
        if(isFill){
            System.out.printf("Drawing circle with fill at %s and %s using color %s", x, y, color);
            System.out.println();
        }
    }
}
