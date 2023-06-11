package com.danil.patterns.behavioral.interpreter;

class AddExpression implements Expression {
    Expression first;
    Expression second;

    public AddExpression(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int interpret() {
        return first.interpret() + second.interpret();
    }
}

