package Facade;

class CPU {
    public void  jmp(long p) {

    }

    public void exec() {

    }
}


class Memory {
    public void load(long p, byte[] data) {

    }
}


class Hdd {
    public byte[] read(long p) {
        return  null;
    }
}


public class Computer {
    private CPU cpu;
    private Hdd hdd;
    private Memory memory;

    public Computer() {
        cpu = new CPU();
        hdd = new Hdd();
        memory = new Memory();
    }

    public void power() {
        memory.load(1, hdd.read(2));
        cpu.jmp(1);
        cpu.exec();
    }
}
