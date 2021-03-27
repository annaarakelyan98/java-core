package com.designPatterns.creational.factory.byInterface.shapeCreate;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method!");
    }
}
