package com.pluralsight.fixedAsset;


import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

import javax.xml.namespace.QName;
import java.awt.*;
import java.util.Scanner;

public class FinanceApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Your Name");
        String name = scanner.nextLine();

        System.out.println("Enter Owner:");
        String owner = scanner.nextLine();
        Portfolio myPortfolio = new Portfolio(name, owner);

        BankAccount account1 = new BankAccount("Pam", "123", 1500);
        Valuable account2 = new BankAccount("Gary", "232", 1500);
        account1.deposit(100);
        account1.withdaw(200);
        ((BankAccount) account2).deposit(100);
        //Add both to the List of Valuables
        myPortfolio.add(account1);
        myPortfolio.add(account2);

        Menu(myPortfolio);

        System.out.println("Total Portfolio Value: " + myPortfolio.getValue());//(1500+1500+20000+1000)=24000
        System.out.println("Highest Valuable: " + myPortfolio.getMostValuable().toString());
        System.out.println("Least Valuable: " + myPortfolio.getLeastValuable().toString());
    }

    public static void Menu(Portfolio portfolio) {
        boolean exit = false;
        while (!exit) {
            System.out.println("""
                    What Asset Would You Like To Add
                    1) House
                    2) Gold
                    3) Jewelry
                    4) Bank Account
                    5) Credit Card
                    0) exit""");
            String input = scanner.nextLine();
            int choice = Integer.parseInt(input);
            switch (choice) {
                case 1:
                    addHouse(portfolio);
                    break;
                case 2:
                    addGold(portfolio);
                    break;
                case 3:
                    addJewelry();
                    break;
                case 4:
                    addBankAccount();
                    break;
                case 5:
                    addCreditCard();
                    break;
                case 0:
                    exit = true;
                    break;

            }

        }
    }

    private static void addHouse(Portfolio portfolio) {
//        System.out.println("Name:");
//        String name = scanner.nextLine();
//
//        System.out.println("Value:");
//        double value = Double.parseDouble(scanner.nextLine());
//
//        System.out.println("Year:");
//        int year = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("SquareFoot:");
//        int squareFeet = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Bedrooms:");
//        int bedrooms = Integer.parseInt(scanner.nextLine());
//        House house = new House(name, value, year, squareFeet, bedrooms);

        House house = new House("AirBnB", 20000, 2020, 200, 2);
        portfolio.add(house);

    }

    private static void addGold(Portfolio portfolio) {
//        System.out.println("Name:");
//        String name = scanner.nextLine();
//        System.out.println("Weight:");
//        double weight = Double.parseDouble(scanner.nextLine());
//        System.out.println("Name:");
//        System.out.println("Value:");
//        double value = Double.parseDouble(scanner.nextLine());
      //  Gold gold = new Gold(name, value, weight);

        Gold gold = new Gold("IphoneCase", 1000, 3);
        portfolio.add(gold);

    }

    private static void addJewelry() {
    }

    private static void addBankAccount() {
    }

    private static void addCreditCard() {
    }

}
