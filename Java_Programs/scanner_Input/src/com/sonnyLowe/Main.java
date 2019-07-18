package com.sonnyLowe;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your year of birth? :");

        boolean hasNextInt = scanner.hasNextInt();//checks if input is int

        if(hasNextInt) {
            int birthYear = scanner.nextInt();
            scanner.nextLine(); //handles next line from the enter

            System.out.println("What is your name? : ");
            String name = scanner.nextLine();

            int age = 2019 - birthYear;

            if (age > 0 && age <= 100) {
                System.out.println("Name: " + name);
                System.out.println("Year of Birth: " + birthYear);
                System.out.println("Age: " + age);
            } else {
                System.out.println("Invalid Year of Birth Input");
            }
        }else{
            System.out.println("Please input a number.");
        }

        scanner.close();

        //parsing a int from a string

        String parsedString = "2019";

        int integerFromString = Integer.parseInt(parsedString);
        System.out.println(integerFromString);
        integerFromString += 1;
        System.out.println(integerFromString);

        //parsing a double from a string

        double doubleFromString = Double.parseDouble(parsedString);
        System.out.println(doubleFromString);
        doubleFromString += 0.123;
        System.out.println(doubleFromString);

    }
}
