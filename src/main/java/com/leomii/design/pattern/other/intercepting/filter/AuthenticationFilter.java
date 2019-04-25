package com.leomii.design.pattern.other.intercepting.filter;

public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}