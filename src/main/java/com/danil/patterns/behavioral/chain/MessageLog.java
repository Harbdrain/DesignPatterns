package com.danil.patterns.behavioral.chain;

class MessageLog extends MyLog {

    public MessageLog(LogLevel level) {
        super(level);
    }

    @Override
    void write(String message, LogLevel level) {
        System.out.println("Showing user message: " + level + ": " + message);
    }

}
