package com.danil.patterns.behavioral.mediator;

class SimpleUser implements User {
    String name;
    Chat chat;

    public SimpleUser(String name, Chat chat) {
        this.name = name;
        this.chat = chat;
        chat.addUser(this);
    }

    @Override
    public void broadcast(String message) {
        chat.broadcast("@" + name + ": " + message, this);
    }

    @Override
    public void recieveMessage(String message) {
        System.out.println(name + " - " + message);
    }
}
