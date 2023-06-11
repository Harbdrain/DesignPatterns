package com.danil.patterns.behavioral.chain;

abstract class MyLog {
    LogLevel level;
    MyLog nextLog = null;

    public MyLog(LogLevel level) {
        this.level = level;
    }

    public void setNextLog(MyLog nextLog) {
        this.nextLog = nextLog;
    }

    public void notify(String message, LogLevel level) {
        if (level.ordinal() <= this.level.ordinal()) {
            write(message, level);
        }

        if (nextLog != null) {
            nextLog.notify(message, level);
        }
    }

    abstract void write(String message, LogLevel level);
}
