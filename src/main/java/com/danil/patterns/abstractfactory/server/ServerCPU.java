package com.danil.patterns.abstractfactory.server;

import com.danil.patterns.abstractfactory.CPU;

class ServerCPU implements CPU {
    private float frequency = 3.2f;

    @Override
    public float getFrequency() {
        return this.frequency;
    }

}
