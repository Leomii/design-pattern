package com.leomii.design.pattern.behavior.visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}