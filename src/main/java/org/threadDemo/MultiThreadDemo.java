package org.threadDemo;

public class MultiThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("My Thread is in running state...");
    }

    public static void main(String[] args) {
        MultiThreadDemo multiThreadDemo = new MultiThreadDemo();
        Thread obj = new Thread(multiThreadDemo);
        obj.start();
    }
}
