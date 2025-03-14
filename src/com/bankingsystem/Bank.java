package com.bankingsystem;

import Exceptions.InsufficientBalanceException;
import Exceptions.InvalidAmountException;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Customer> customers;
    List<Account> accounts;

    public Bank() {
        this.customers = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }


    public Customer findCustomer(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    void performTransaction(Transaction transaction) throws InvalidAmountException, InsufficientBalanceException {
        Account account = findAccount(transaction.getAccountNumber());
        if (account == null) {
            System.out.println("Account not found");
            return;
        }
        if (transaction.getTransactionType().equalsIgnoreCase("deposit")) {
                account.deposit(transaction.getAmount());
        } else if (transaction.getTransactionType().equalsIgnoreCase("withdraw")) {
                account.withdraw(transaction.getAmount());
        }
    }



}