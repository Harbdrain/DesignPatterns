package com.danil.patterns.behavioral.interpreter;

class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expression = context.evaluate("2+3-1");
        System.out.println(expression.interpret());
    }
}
