package com.danil.patterns.behavioral.command;

class User {
    Command start;
    Command stop;
    Command reboot;

    public User(Command start, Command stop, Command reboot) {
        this.start = start;
        this.stop = stop;
        this.reboot = reboot;
    }

    public void executeStart() {
        start.execute();
    }

    public void executeStop() {
        stop.execute();
    }

    public void executeReboot() {
        reboot.execute();
    }
}
