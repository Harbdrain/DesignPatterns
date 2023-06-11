package com.danil.patterns.behavioral.visitor;

class Main {
    public static void main(String[] args) {
        Element CarElement = new CarElement();
        Visitor hooligan = new HooliganVisitor();
        CarElement.accept(hooligan);
        Visitor mechanic = new MechanicVisitor();
        CarElement.accept(mechanic);
    }
}
