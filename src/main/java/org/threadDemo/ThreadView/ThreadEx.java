package org.threadDemo.ThreadView;

public class ThreadEx {

    public static void main(String[] args) {
        Hi obj = new Hi();
        Hello obj2 = new Hello();

        obj.start();
        try{
            Thread.sleep(10);
        }catch(Exception e){}
        obj2.start();

    }
}
