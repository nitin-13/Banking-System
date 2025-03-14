package com.bankingsystem;

import Exceptions.InsufficientBalanceException;
import Exceptions.InvalidAmountException;

public class Main {
    public static void main(String[] args) {

        Bank sbi = new Bank();

        Customer cx1 = new Customer("Cx123", "Ram", "+919158921111");
        Customer cx2 = new Customer("Cx456", "Sham", "+919158922222");

        sbi.addCustomer(cx1);
        sbi.addCustomer(cx2);

        SavingsAccount savingsAccount = new SavingsAccount("SA123", cx1, 0.02f);
        CurrentAccount CurrentAccount = new CurrentAccount("CA123", cx2, 1000);

        sbi.addAccount(savingsAccount);
        sbi.addAccount(CurrentAccount);

        //Transactions
        try {

            System.out.println("Transaction 1 :");
            Transaction savingsDeposit = new Transaction("SA123",2500,"deposit");
            sbi.performTransaction(savingsDeposit);

            System.out.println("\nTransaction 2 :");
            Transaction savingsWithdraw = new Transaction("SA123",500,"withdraw");
            sbi.performTransaction(savingsWithdraw);

            System.out.println("\nTransaction 3 :");
            Transaction currentDeposit = new Transaction("CA123",3500,"deposit");
            sbi.performTransaction(currentDeposit);

            System.out.println("\nTransaction 4 :");
            Transaction currentWithdraw = new Transaction("CA123",1000,"withdraw");
            sbi.performTransaction(currentWithdraw);

            System.out.println("\nTransaction 5 :");
            Transaction savingsDepositexc = new Transaction("SA123",0,"deposit");
            sbi.performTransaction(savingsDepositexc); //throws InvalidAmountException

            System.out.println("\nTransaction 6 :");
            Transaction savingsDepositexc2 = new Transaction("SA123",5000,"withdraw");
            sbi.performTransaction(savingsDepositexc2); //throws InsufficientBalanceException

            System.out.println("\nTransaction 7 :");
            Transaction currentDepositexc = new Transaction("CA123",0,"deposit");
            sbi.performTransaction(currentDepositexc); //throws InvalidAmountException

            System.out.println("\nTransaction 8 :");
            Transaction currentDepositexc2 = new Transaction("CA123",10000,"withdraw");
            sbi.performTransaction(currentDepositexc2); //throws InsufficientBalanceException



        } catch (InsufficientBalanceException | InvalidAmountException e) {
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println("\nBalance in Saving account after transactions : ₹"+savingsAccount.getBalance());
        System.out.println("\nBalance in Current account after transactions : ₹"+savingsAccount.getBalance());

        //Interest Calculation
        savingsAccount.addInterest();
        System.out.printf("\nRam's Savings Balance after interest: ₹%.2f",savingsAccount.getBalance());



    }
}