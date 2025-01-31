package com.bank;

public class Account implements AccountService{

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
