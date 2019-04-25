package com.leomii.design.pattern.create.abstractfactory;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}