package com.danil.patterns.behavioral.command;

class StopCommand implements Command {
    private Computer computer;

    public StopCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}

