package org.exceptionDemo.bankDemo;

import java.sql.SQLOutput;

public class BankCalc {
    public static void main(String[] args) {

        CheckingAccount ck = new CheckingAccount(101);
        System.out.println("Dipositing £500");
        ck.deposit(500);

        try
        {
            System.out.println("\n Withdrawing £100...");
            ck.withdraw(100.00);
            System.out.println("\n Withdrawing £600...");
            ck.withdraw(600.00);
        }catch(InsufficientFundsException e)
        {
            System.out.println("Sorry but you are sort of £"+e.getAmount());
            e.printStackTrace();
        }
    }
}
