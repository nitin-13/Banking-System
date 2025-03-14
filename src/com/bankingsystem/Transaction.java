package com.bankingsystem;

public class Transaction {
    private String accountNumber;
    private double amount;
    private String transactionType;

    public Transaction(String accountNumber, double amount, String transactionType) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }
}