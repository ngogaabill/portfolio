package com.pluralsight.finance;

public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdaw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }


    public void debt() {
    }

    @Override
    public double getValue() {
        return balance;
    }

    @Override
    public String toString() {
        return name + " - $ " + getValue();
    }
}
