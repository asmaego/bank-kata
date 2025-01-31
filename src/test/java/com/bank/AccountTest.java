package com.bank;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void accountDeposit() {
        Account account = new Account(0);

        account.deposit(100);
        account.deposit(130);

        assertEquals(130, account.getBalance(), "Balance should be 130 after deposit");

    }

    @Test
    public void accountWithdrawal() {
        Account account = new Account(270);

        account.deposit(50);
        account.deposit(110);

        assertEquals(110, account.getBalance(), "Balance should be 110 after withdrawal");
    }

    @Test
    public void accountStatement() {

        Account account = new Account(0);
        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        assertEquals(2500, account.getBalance(), "Balance should be 500 after operations");

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        account.printStatement();

        String expectedStatement =
                "Date || Amount || Balance\n" +
                        LocalDate.now() + " || -500 || 2500\n" +
                        LocalDate.now() + " || 2000 || 3000\n" +
                        LocalDate.now() + " || 1000 || 1000\n";

        assertEquals(expectedStatement, outputStream.toString(), "Statement should match expected output");
    }
}
