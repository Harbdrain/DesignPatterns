package com.danil.patterns.behavioral.chain;

class ConsoleLog extends MyLog {

    public ConsoleLog(LogLevel level) {
        super(level);
    }

    @Override
    void write(String message, LogLevel level) {
        System.out.println("Writing to console: " + level + ": " + message);
    }
}
