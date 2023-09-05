package com.designpatterns.journaldev.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static final Map<ShapeType, Shape> shapes = new HashMap<>();

    private ShapeFactory(){}

    public static Shape getShape(ShapeType type){
        switch (type){
            case LINE -> {
                shapes.computeIfAbsent(type, k -> new Line());
            }
            case CIRCLE -> {
                shapes.computeIfAbsent(type, k -> new Circle(false));
            }
            case CIRCLE_WITH_FILL -> {
                shapes.computeIfAbsent(type, k -> new Circle(true));
            }
            default -> throw new IllegalStateException("No matching shape found");
        }
        return shapes.get(type);
    }

    public static enum ShapeType{
        LINE, CIRCLE_WITH_FILL, CIRCLE
    }
}
