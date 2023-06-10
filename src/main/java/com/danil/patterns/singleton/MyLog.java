package com.danil.patterns.singleton;

class MyLog {
    private static MyLog instance = null;

    private MyLog() {
    }

    public static synchronized MyLog getMyLog() {
        if (instance == null) {
            instance = new MyLog();
        }

        return instance;
    }

    public void info(String message) {
        System.out.println("INFO: " + message);
    }

    public void warn(String message) {
        System.out.println("WARN: " + message);
    }

    public void error(String message) {
        System.out.println("ERROR: " + message);
    }
}
