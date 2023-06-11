package com.danil.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

class SimpleChat implements Chat {
    String name;
    List<User> users = new ArrayList<>();

    public SimpleChat(String name) {
        this.name = name;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void delUser(User user) {
        users.remove(user);
    }

    @Override
    public void broadcast(String message, User user) {
        this.users.forEach(e -> {
            if (!e.equals(user)) {
                e.recieveMessage(this.name + ": " + message);
            }
        });
    }
}
