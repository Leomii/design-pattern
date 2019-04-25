package com.leomii.design.pattern.other.intercepting.filter;

public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}