package org.interfaceDemo;

 interface CustomInterface {

    public abstract void method1();

    public default void method2() {
        method4();
        method5();
        System.out.println("default method");
    }

    public static void method3() {
        method5();
        System.out.println("static method");
    }

    private void method4() {
        System.out.println("private method ");
    }

    private static void method5() {
        System.out.println("private static method ");
    }

}

public class CustomClass implements CustomInterface {


    @Override
    public void method1() {
        System.out.println("abstract method");
    }

    public static void main(String[] args) {

        CustomInterface instance = new CustomClass();
        instance.method1();
        instance.method2();
        CustomInterface.method3();
    }
}
