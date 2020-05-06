package org.threadDemo;



public class JoinExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyClass2(),"th1");
        Thread t2 = new Thread(new MyClass2(),"th2");
        Thread t3= new Thread(new MyClass2(),"th3");

        t1.start();
        t2.start();
        t3.start();

    }
}

class MyClass2 implements Runnable {

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Thread started :" + t.getName());

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread Ended :" + t.getName());
    }
}