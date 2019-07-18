package com.sonnyLowe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car Ferrari = new Car();
        Car Tesla = new Car();

        Ferrari.setColor("red");
        System.out.println("Color is: " + Ferrari.getColor());

        // *******
        System.out.println("*****************");
        // *******

        bankAccountChallenge Sonny = new bankAccountChallenge();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your Account Number?");
        Sonny.setAccountNum(scanner.nextInt());
        scanner.nextLine();

        System.out.println("What is your balance?");
        int balance = scanner.nextInt();
        Sonny.setBalance(balance);
        scanner.nextLine();

        System.out.println("What is your Name?");
        Sonny.setCustomerName(scanner.nextLine());

        System.out.println("What is your Email?");
        Sonny.setEmail(scanner.nextLine());

        System.out.println("What is your Phone Number? (do not type dashes)");
        Sonny.setPhoneNum(scanner.nextInt());

        System.out.println("Created Account " + Sonny.getAccountNum() + " owned by " + Sonny.getCustomerName());
        System.out.println("Balance of $" + Sonny.getBalance() + ".00  Contact information :");
        System.out.println("email: " + Sonny.getEmail() + " phone number : " + Sonny.getPhoneNum());

        System.out.println();
        System.out.println("Type 1 to add to balance. Type 2 to take from balance.");
        int takeOrAdd = scanner.nextInt();
        scanner.nextLine();

        if (takeOrAdd == 1){
            System.out.println("How much would you like to add?");
            balance = bankAccountChallenge.addBalance(scanner.nextInt(), balance);
            System.out.println("New Balance is: $" + balance + ".00");
        }else if (takeOrAdd == 2){
            System.out.println("How much would you like to take?");
            balance = bankAccountChallenge.takeBalance(scanner.nextInt(), balance);
            System.out.println("New Balance is: $" + balance + ".00");
        }


        scanner.close();



    }
}
