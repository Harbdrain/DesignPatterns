package com.danil.patterns.creational.abstractfactory.personal;

import com.danil.patterns.creational.abstractfactory.HDD;

class PersonalHDD implements HDD {
    private int capacity = 2048;

    @Override
    public int getCapacity() {
        return this.capacity;
    }

}
