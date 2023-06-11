package com.danil.patterns.behavioral.observer;

import java.util.List;

class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(String event, List<String> data) {
        System.out.println("Hello, " + name + "!");
        System.out.println(event);
        System.out.println(data);
    }
}
