package com.designpatterns.journaldev.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ShapeComposite implements Shape{

    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String color) {
        for(Shape shape: shapes){
            shape.draw(color);
        }
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void deleteShape(Shape shape){
        shapes.remove(shape);
    }

    public void clearAllShapes(){
        shapes.clear();
    }
}
