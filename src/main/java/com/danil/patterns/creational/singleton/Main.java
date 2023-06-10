package com.danil.patterns.creational.singleton;

class Main {
    public static void main(String[] args) {
        MyLog log = MyLog.getMyLog();
        log.info("Created MyLog object");

        log.warn("Check log == null is dead code");
        if (log == null) {
            log.error("MyLog object creation ended up as failure");
        }
    }
}
