package com.designPatterns.creational.factory.byInterface;

import com.designPatterns.creational.factory.byInterface.shapeCreate.Shape;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("circle");
        shape.draw();

        shape = shapeFactory.getShape("Square");
        shape.draw();

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
    }
}
