package com.designpatterns.journaldev.structural.composite;

public class Demo {
    public static void main(String[] args) {

        ShapeComposite composite = new ShapeComposite();
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        composite.addShape(circle);
        composite.addShape(triangle);
        composite.addShape(square);

        composite.draw("Red");
    }
}
