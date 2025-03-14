package com.bankingsystem;

import Exceptions.InvalidAmountException;
import Exceptions.InsufficientBalanceException;

public class SavingsAccount extends Account{

    private float interestRate;

    public SavingsAccount(String accountNumber, Customer customer, float interestRate) {
        super(accountNumber, customer);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if(amount <= 0) {
            throw new InvalidAmountException("Deposit amount cannot be less than or equal to zero");
        }
        balance += amount;
        System.out.println("Deposited amount: ₹" + amount);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException, InvalidAmountException {
        if(amount <= 0) {
            throw new InvalidAmountException("Withdraw amount cannot be less than or equal to zero");
        }
        if(amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance in the account");
        }else {
            balance -= amount;
            System.out.println("Withdrawn amount: ₹" + amount);
        }
    }
    public void addInterest(){
        balance += balance * interestRate;
    }
}