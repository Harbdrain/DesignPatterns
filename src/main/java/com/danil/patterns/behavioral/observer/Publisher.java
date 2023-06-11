package com.danil.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class Publisher implements Observable {
    List<String> books = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : subscribers) {
            o.handleEvent("New books available!", books);
        }
    }
}
