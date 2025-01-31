package com.bank;

import java.util.ArrayList;
import java.util.List;


public class Account implements AccountService{
    private int balance;
    private List<String> statement = new ArrayList<>();

    public Account(int initBalance) {
        this.balance = initBalance;
    }

    public int getBalance() {
        return balance;
    }
    @Override
    public void deposit(int amount) {
       throw new UnsupportedOperationException("Deposit operation not supported yet.");
    }

    @Override
    public void withdraw(int amount) {
        throw new UnsupportedOperationException("Withdraw operation not supported yet.");
    }

    @Override
    public void printStatement() {
        throw new UnsupportedOperationException("Print operation not supported yet.");
    }
}
