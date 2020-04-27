package org.final_finally_finalizeDemo;

import java.sql.SQLOutput;

public class FinalizeDemo {

    public void finalize() throws Throwable{
        System.out.println("Object garbage collected");
    }

    public static void main(String[] args) {
        FinalizeDemo fd = new FinalizeDemo();
        fd = null;
        System.gc();
    }
}
