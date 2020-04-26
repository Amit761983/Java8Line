package org.interfaceDemo;

public class CalculatorMaster implements CustomCalculator {

    public static void main(String[] args) {
        CustomCalculator demo = new CalculatorMaster();

        int sumofEven = demo.addEvenNumber(1,2,3,4,5,6,7,8,9);
        System.out.println(sumofEven);
        int sumofOdd = demo.addOddNumber(1,2,3,4,5,6,7,8,9);
        System.out.println(sumofOdd);
    }
}
