package org.threadDemo;

public class JoinDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread(new MyClass(),"th1");
        Thread t2 = new Thread(new MyClass(),"th2");
        Thread t3 = new Thread(new MyClass(),"th3");


        // start first thread immediately
        t1.start();

        /*

        Start second thread(th2) once first thread(th1)is dead
         */

        try {
            t1.join();
        }catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }
        // start second thread immediately
        t2.start();

        try
        {
            t2.join();
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        t3.start();

        try
        {
            t3.join();
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("All three thread have finished execution");
    }

}


class MyClass implements Runnable
{


    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Thread started :  "+t.getName());
        try{
            Thread.sleep(4000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Thread ended " +t.getName());
    }
}
