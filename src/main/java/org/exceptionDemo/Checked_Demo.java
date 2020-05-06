package org.exceptionDemo;

public class Checked_Demo {

    public static void main(String[] args) {

        try
        {
            int a[] = new int[2];
            System.out.print("Access the Element three : " +a[3]);
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Exception Thrown : "+ae);
        }
        System.out.println("out of the block ");
    }
}
