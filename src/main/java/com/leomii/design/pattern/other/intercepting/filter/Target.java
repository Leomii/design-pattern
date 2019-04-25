package com.leomii.design.pattern.other.intercepting.filter;

public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}