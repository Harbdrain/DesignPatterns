package com.danil.patterns.behavioral.observer;

class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        
        Subscriber subscriber1 = new Subscriber("Danil");
        Subscriber subscriber2 = new Subscriber("Vasiliy");
        Subscriber subscriber3 = new Subscriber("Edgar");

        publisher.addObserver(subscriber1);
        publisher.addObserver(subscriber2);
        publisher.addBook("Harry Potter and Sorcerer's Stone");
        publisher.addBook("So I'm a Spider, So What?");

        publisher.addObserver(subscriber3);
        publisher.addBook("Wolf and Spice");
    }
}
