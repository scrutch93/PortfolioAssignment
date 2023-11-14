package com.pluralsight;

import com.pluralsightfinance.BankAccount;

public class FinanceApplication {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Emily", "456", 1500);
// try to deposit money into both accounts
        account1.deposit(100);
        account2.deposit(100);

        //Remember that interfaces can't be instantiated.

        //deposit doesn't work for account 2 because it the interface's only method was getValue()


    }


}
