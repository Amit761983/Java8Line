package org.threadDemo;

public class ThreadTest extends Thread{

    public void run()
    {
        System.out.println("My thread is running state...");
    }

    public static void main(String[] args) {
        ThreadTest td = new ThreadTest();
       td.start();
    }
}
