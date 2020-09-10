package org.abstractDemo.custo;

public class pc extends Cpu {

    private String processor;

    public pc(int ram, int hdd, String processor) {
        super(ram, hdd);
        this.processor = processor;
    }

    @Override
    public void deal() {
        if(processor==null)
        {
            System.out.println("Requirement Does not match");
        }
        else
        {
            System.out.println("Requirement match");
        }
    }

    public static void main(String[] args) {
        {
            Cpu cpu = new pc(5,500,null);
            Cpu pc = new pc(8,1,"i7");

            cpu.deal();
            System.out.println(cpu.toString());
            pc.deal();
            pc.changeRam(18);
            System.out.println(pc.toString());


        }
    }

}
