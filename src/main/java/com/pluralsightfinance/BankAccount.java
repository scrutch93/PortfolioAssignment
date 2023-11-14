package com.pluralsightfinance;

import com.pluralsight.Valuable;

public class BankAccount implements Valuable {

    private String name;

    private String accountNumber;

    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double deposit(double amount){

        return amount;
    }

    public double withdraw(double amount){

        return amount;
    }


    public double getValue() {
        return 0;
    }
}
