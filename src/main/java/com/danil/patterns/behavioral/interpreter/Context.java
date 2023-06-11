package com.danil.patterns.behavioral.interpreter;

class Context {
    Expression evaluate(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isDigit(s.charAt(i))) {
                continue;
            }

            Expression left = evaluate(s.substring(0, i));
            Expression right = new NumberExpression(Integer.parseInt(s.substring(i + 1)));

            char op = s.charAt(i);
            switch (op) {
                case '+': {
                    return new AddExpression(left, right);
                }
                case '-': {
                    return new SubExpression(left, right);
                }
            }
        }

        return new NumberExpression(Integer.parseInt(s));
    }
}
