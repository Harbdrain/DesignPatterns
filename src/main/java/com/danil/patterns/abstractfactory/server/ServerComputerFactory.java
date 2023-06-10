package com.danil.patterns.abstractfactory.server;

import com.danil.patterns.abstractfactory.CPU;
import com.danil.patterns.abstractfactory.ComputerFactory;
import com.danil.patterns.abstractfactory.HDD;
import com.danil.patterns.abstractfactory.RAM;

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
