package org.final_finally_finalizeDemo;

public class FinallyDemo {
    public static void main(String[] args) {

        try{
            int a = 10;
            int b =0;
            int result = a/b;
        }
        catch(Exception e)
        {
            System.out.println("Error : " + e.getMessage());
        }
        finally {
            System.out.println("Finished");
        }
    }
}
