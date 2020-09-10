package org.final_finally_finalizeDemo;

import java.sql.SQLOutput;

public class FinalDemo {

    final int value = 10;

    // Following are example of declaring constants
    public static final int BOXWIDTH=6;
    static final String TITLE = "Manager";

    public void changeValue()
    {
        //value = 12; // will give an error
    }

    public void displayValue()
    {
        System.out.println(value);
    }

    public static void main(String[] args) {
        FinalDemo fdemo = new FinalDemo();
        fdemo.changeValue();
        fdemo.displayValue();
    }
}