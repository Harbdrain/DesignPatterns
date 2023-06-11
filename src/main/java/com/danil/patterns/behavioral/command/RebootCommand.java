package com.danil.patterns.behavioral.command;

class RebootCommand implements Command {
    private Computer computer;

    public RebootCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.reboot();
    }
}


