package com.danil.patterns.creational.abstractfactory.personal;

import com.danil.patterns.creational.abstractfactory.CPU;

class PersonalCPU implements CPU {
    private float frequency = 2.8f;

    @Override
    public float getFrequency() {
        return this.frequency;
    }

}
