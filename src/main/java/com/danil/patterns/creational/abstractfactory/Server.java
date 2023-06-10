package com.danil.patterns.creational.abstractfactory;

import com.danil.patterns.creational.abstractfactory.server.ServerComputerFactory;

class Server {
    public static void main(String[] args) {
        ComputerFactory factory = new ServerComputerFactory();
        CPU cpu = factory.getCPU();
        RAM ram = factory.getRAM();
        HDD hdd = factory.getHDD();
        System.out.println("Server computer:");
        System.out.println("CPU: " + cpu.getFrequency() + "Ghz");
        System.out.println("RAM: " + ram.getCapacity() + "Mb");
        System.out.println("HDD: " + hdd.getCapacity() + "Gb");
    }
}
