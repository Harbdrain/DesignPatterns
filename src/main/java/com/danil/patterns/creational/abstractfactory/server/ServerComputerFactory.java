package com.danil.patterns.creational.abstractfactory.server;

import com.danil.patterns.creational.abstractfactory.CPU;
import com.danil.patterns.creational.abstractfactory.ComputerFactory;
import com.danil.patterns.creational.abstractfactory.HDD;
import com.danil.patterns.creational.abstractfactory.RAM;

public class ServerComputerFactory implements ComputerFactory {
    @Override
    public CPU getCPU() {
        return new ServerCPU();
    }

    @Override
    public RAM getRAM() {
        return new ServerRAM();
    }

    @Override
    public HDD getHDD() {
        return new ServerHDD();
    }

}
