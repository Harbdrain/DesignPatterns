package com.danil.patterns.creational.abstractfactory.server;

import com.danil.patterns.creational.abstractfactory.CPU;

class ServerCPU implements CPU {
    private float frequency = 3.2f;

    @Override
    public float getFrequency() {
        return this.frequency;
    }

}
