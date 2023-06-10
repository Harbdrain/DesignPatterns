package com.danil.patterns.abstractfactory.personal;

import com.danil.patterns.abstractfactory.HDD;

class PersonalHDD implements HDD {
    private int capacity = 2048;

    @Override
    public int getCapacity() {
        return this.capacity;
    }

}
