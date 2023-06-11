package com.danil.patterns.behavioral.mediator;

interface Chat {
    void broadcast(String message, User user);

    void addUser(User user);
    void delUser(User user);
}
