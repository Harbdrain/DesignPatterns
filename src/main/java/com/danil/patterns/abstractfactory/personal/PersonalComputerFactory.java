package com.danil.patterns.abstractfactory.personal;

import com.danil.patterns.abstractfactory.CPU;
import com.danil.patterns.abstractfactory.ComputerFactory;
import com.danil.patterns.abstractfactory.HDD;
import com.danil.patterns.abstractfactory.RAM;

public class PersonalComputerFactory implements ComputerFactory {

    @Override
    public CPU getCPU() {
        return new PersonalCPU();
    }

    @Override
    public RAM getRAM() {
        return new PersonalRAM();
    }

    @Override
    public HDD getHDD() {
        return new PersonalHDD();
    }
}
