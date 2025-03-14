package com.bankingsystem;

import Exceptions.InvalidAmountException;
import Exceptions.InsufficientBalanceException;

public class CurrentAccount extends Account{

    private float overdraftLimit;

    public CurrentAccount(String accountNumber, Customer customer, float overdraftLimit) {
        super(accountNumber, customer);
        this.overdraftLimit = overdraftLimit;
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
        if(amount > balance + overdraftLimit) {
            throw new InsufficientBalanceException("Insufficient balance in the account");
        }else {
            balance -= amount;
            System.out.println("Withdrawn amount: ₹" + amount);
        }

    }
}