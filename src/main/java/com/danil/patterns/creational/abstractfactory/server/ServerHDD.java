package com.danil.patterns.creational.abstractfactory.server;

import com.danil.patterns.creational.abstractfactory.HDD;

class ServerHDD implements HDD {
    private int capacity = 200;

    @Override
    public int getCapacity() {
        return this.capacity;
    }
}
