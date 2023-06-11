package com.danil.patterns.behavioral.chain;

class FileLog extends MyLog {

    public FileLog(LogLevel level) {
        super(level);
    }

    @Override
    void write(String message, LogLevel level) {
        System.out.println("Writing to file: " + level + ": " + message);
    }
}
