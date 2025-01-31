package com.bank;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account account = new Account(0);
        account.deposit(3300);
        account.deposit(200);
        account.deposit(1500);
        account.withdraw(150);
        account.withdraw(220);

        account.printStatement();
        System.out.println("Balance after operations is : " + account.getBalance());
    }
}