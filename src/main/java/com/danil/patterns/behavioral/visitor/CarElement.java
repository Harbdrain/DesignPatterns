package com.danil.patterns.behavioral.visitor;

class CarElement implements Element {
    Element[] elements;

    public CarElement() {
        elements = new Element[] {
            new BodyElement(),
            new EngineElement()
        };
    }

    @Override
    public void accept(Visitor visitor) {
        for (Element e : elements) {
            e.accept(visitor);
        }
    }
}
