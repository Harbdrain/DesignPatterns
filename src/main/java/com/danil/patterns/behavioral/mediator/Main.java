package com.danil.patterns.behavioral.mediator;

class Main {
    public static void main(String[] args) {
        Chat chat = new SimpleChat("Conv");
        User user1 = new SimpleUser("User A", chat);
        User user2 = new SimpleUser("User B", chat);
        User user3 = new SimpleUser("User C", chat);

        user1.broadcast("Hello! How are you?");
        user2.broadcast("Hi. Nice, what about you?");
        user3.broadcast("o/ Good, learning design patterns");
    }
}
