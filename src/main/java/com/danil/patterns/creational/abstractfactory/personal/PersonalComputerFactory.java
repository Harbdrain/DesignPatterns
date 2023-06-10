package com.danil.patterns.creational.abstractfactory.personal;

import com.danil.patterns.creational.abstractfactory.CPU;
import com.danil.patterns.creational.abstractfactory.ComputerFactory;
import com.danil.patterns.creational.abstractfactory.HDD;
import com.danil.patterns.creational.abstractfactory.RAM;

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
