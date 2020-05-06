package org.exceptionDemo;

import java.sql.SQLOutput;

public class FinalBlock_Demo {

    public static void main(String[] args) {
        int a[] = new int[2];

        try
        {
            System.out.println("Access Element Three : "+a[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception Thrown : " +e);
        }
        finally {
            a[0]=6;
            System.out.println("First element value : "+a[0]);
            System.out.println("The final statement is executed ");
        }
    }
}
