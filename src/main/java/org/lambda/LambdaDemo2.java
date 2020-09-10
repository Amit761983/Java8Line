package org.lambda;

public class LambdaDemo2 {

    public static void main(String[] args) {
        Runnable r =  new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello with lambda");
            }
        };
        new Thread(r).start();
    }
}
