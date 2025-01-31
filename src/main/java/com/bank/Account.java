package com.bank;

import java.time.LocalDate;
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
        balance += amount;
        statement.add(LocalDate.now() + " || " + amount+ " || "+balance);
    }

    @Override
    public void withdraw(int amount) {
        balance -= amount;
        statement.add(LocalDate.now() + " || -" + amount+ " || "+balance);
    }

    @Override
    public void printStatement() {
        System.out.println("Date || Amount || Balance");
        for (int i = statement.size()-1; i >=0; i--) {
            System.out.println(statement.get(i));
        }
    }
}
