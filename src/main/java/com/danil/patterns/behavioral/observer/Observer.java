package com.danil.patterns.behavioral.observer;

import java.util.List;

interface Observer {
    void handleEvent(String event, List<String> data);
}
