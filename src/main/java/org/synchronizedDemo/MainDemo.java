package org.synchronizedDemo;

public class MainDemo {
    public static void main(String[] args) {
        Line obj = new Line();

        // we are creating two threads which share

        // same Object

        Train train1 = new Train(obj);
        Train train2 = new Train(obj);

        // both thread start executing.

        train1.start();
        train2.start();
    }
}
