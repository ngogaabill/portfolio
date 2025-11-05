package com.pluralsight.finance;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void charge(double amount) {
        balance += amount;
    }

    public void pay(double amount) {
        balance -= amount;
    }

    @Override
    public double getValue() {
        return balance * -1;//make credit neg
    }

    @Override
    public String toString() {
        return name + " - $ " + getValue();
    }

    @Override
    public int compareTo(Valuable o) {
        return Double.compare(this.getValue(),o.getValue());
    }
}
