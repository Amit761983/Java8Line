package org.abstractDemo.custo;

public abstract class Cpu {

    private int ram;
    private int hdd;

    public Cpu(int ram, int hdd) {
        this.ram = ram;
        this.hdd = hdd;
    }

    public abstract void deal();

    public void changeRam(int newRam)
    {
        this.ram = newRam;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
