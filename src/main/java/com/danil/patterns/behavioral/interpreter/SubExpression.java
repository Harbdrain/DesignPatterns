package com.danil.patterns.behavioral.interpreter;

class SubExpression implements Expression {
    Expression first;
    Expression second;

    public SubExpression(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int interpret() {
        return first.interpret() - second.interpret();
    }
}
