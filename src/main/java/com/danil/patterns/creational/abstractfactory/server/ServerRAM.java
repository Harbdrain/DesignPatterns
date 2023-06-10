package com.danil.patterns.creational.abstractfactory.server;

import com.danil.patterns.creational.abstractfactory.RAM;

class ServerRAM implements RAM {
    private int capacity = 2048;

    @Override
    public int getCapacity() {
        return this.capacity;
    }

}
