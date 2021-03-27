package com.designPatterns.creational.factory.byInterface.shapeCreate;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method!");
    }
}
