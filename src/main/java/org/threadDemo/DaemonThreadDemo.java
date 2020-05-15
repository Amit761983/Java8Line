package org.threadDemo;


public class DaemonThreadDemo extends Thread {

    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("Daemon thread executing....");
        }
        else
        {
            System.out.println("User(normal) thread executing...");
        }
    }

    public static void main(String[] args) {
        DaemonThreadDemo dtd = new DaemonThreadDemo();
        DaemonThreadDemo dtd2 = new DaemonThreadDemo();

        dtd.setDaemon(true);

        dtd.start();
        dtd2.start();
    }
}
