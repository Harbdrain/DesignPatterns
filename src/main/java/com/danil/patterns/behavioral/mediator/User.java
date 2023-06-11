package com.danil.patterns.behavioral.mediator;

interface User {
    void broadcast(String message);
    void recieveMessage(String message);
}
