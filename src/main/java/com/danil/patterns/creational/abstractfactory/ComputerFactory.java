package com.danil.patterns.creational.abstractfactory;

public interface ComputerFactory {
    CPU getCPU();
    RAM getRAM();
    HDD getHDD();
}
