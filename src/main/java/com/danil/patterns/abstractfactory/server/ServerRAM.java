package com.danil.patterns.abstractfactory.server;

import com.danil.patterns.abstractfactory.RAM;

class ServerRAM implements RAM {
    private int capacity = 2048;

    @Override
    public int getCapacity() {
        return this.capacity;
    }

}
