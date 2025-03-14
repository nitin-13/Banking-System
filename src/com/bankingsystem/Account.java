package com.bankingsystem;

import Exceptions.InsufficientBalanceException;
import Exceptions.InvalidAmountException;

public abstract class Account {

    private String accountNumber;
    protected double balance;
    private Customer customer;

    public Account(String accountNumber, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.customer = customer;
    }

    public abstract void deposit(double amount) throws InvalidAmountException;
    public abstract void withdraw(double amount) throws InsufficientBalanceException,InvalidAmountException;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }
}