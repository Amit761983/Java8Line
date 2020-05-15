package org.threadDemo.RunnableView;

public class RunnableDemo {

    public static void main(String[] args) {

        Runnable obj = new Hi();
        Runnable obj2 = new Hello();


        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);

        t1.start();
        try{
            Thread.sleep(10);
        }catch(Exception e){}
        t2.start();

    }
}
