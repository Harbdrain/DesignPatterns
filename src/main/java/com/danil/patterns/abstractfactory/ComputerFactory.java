package com.danil.patterns.abstractfactory;

public interface ComputerFactory {
    CPU getCPU();
    RAM getRAM();
    HDD getHDD();
}
