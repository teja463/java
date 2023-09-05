package com.designpatterns.journaldev.structural.flyweight;

import com.designpatterns.journaldev.structural.flyweight.ShapeFactory.ShapeType;

public class Demo {

    private ShapeType shapeTypes[] = {ShapeType.CIRCLE, ShapeType.LINE, ShapeType.CIRCLE_WITH_FILL};

    public static void main(String[] args) {
       Demo d = new Demo();
       d.draw();
    }
    
    private ShapeType getRandomShape(){
        int random = (int)Math.floor(Math.random() * shapeTypes.length);
        return shapeTypes[random];
    }

    private int getRandom(){
        return (int)(Math.random() * 100);
    }

    private void draw(){
        for(int i =0; i<20; i++){
            Shape shape = ShapeFactory.getShape(getRandomShape());
            shape.draw(getRandom(), getRandom(), "blue");
        }
    }
}
