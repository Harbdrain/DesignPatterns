package com.danil.patterns.behavioral.command;

class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        User user = new User(
            new StartCommand(computer),
            new StopCommand(computer),
            new RebootCommand(computer)
        );

        user.executeStart();
        user.executeStop();
        user.executeReboot();
    }
}
