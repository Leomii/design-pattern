package com.leomii.design.pattern.behavior.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}