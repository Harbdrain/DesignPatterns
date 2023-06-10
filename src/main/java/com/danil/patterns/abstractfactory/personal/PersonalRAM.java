package com.danil.patterns.abstractfactory.personal;

import com.danil.patterns.abstractfactory.RAM;

class PersonalRAM implements RAM {
    private int capacity = 16384;

    @Override
    public int getCapacity() {
        return this.capacity;
    }

}
