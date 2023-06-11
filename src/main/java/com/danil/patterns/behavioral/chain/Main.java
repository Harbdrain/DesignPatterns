package com.danil.patterns.behavioral.chain;

class Main {
    public static void main(String[] args) {
        MyLog consoleLog = new ConsoleLog(LogLevel.INFO);
        MyLog fileLog = new FileLog(LogLevel.WARN);
        MyLog messageLog = new MessageLog(LogLevel.ERROR);

        consoleLog.setNextLog(fileLog);
        fileLog.setNextLog(messageLog);

        consoleLog.notify("logs initialized", LogLevel.INFO);
        consoleLog.notify("something doesn't look good", LogLevel.WARN);
        consoleLog.notify("Something broke", LogLevel.ERROR);
    }
}
