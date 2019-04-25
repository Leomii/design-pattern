package com.leomii.design.pattern.behavior.interpreter;

public class InterpreterPatternDemo {


    public static Expression getMaleExpression() {
        //规则：Robert 和 John 是男性
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }


    public static Expression getMarriedWomanExpression() {
        //规则：Julie 是一个已婚的女性
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}