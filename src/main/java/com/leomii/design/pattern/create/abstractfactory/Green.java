package com.leomii.design.pattern.create.abstractfactory;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}