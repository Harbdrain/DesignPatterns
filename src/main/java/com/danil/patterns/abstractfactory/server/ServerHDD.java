package com.danil.patterns.abstractfactory.server;

import com.danil.patterns.abstractfactory.HDD;

class ServerHDD implements HDD {
    private int capacity = 200;

    @Override
    public int getCapacity() {
        return this.capacity;
    }
}
