package com.sonnyLowe;

public class Main {

    public static void main(String[] args) {

        // for statement structure : for(init; termination; increment){  }
        // start the variable (i) at 0 usually because arrays and lists always start at 0


        // small challenge section 5 lesson 47
        //String.format("%.2f" says to print variable with 2 decimal points after
        for(int i = 2; i!=9; i++){
            System.out.println("$10,000 at " + i +"% interest = $" + String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("     **********************");

        //small challenge section 5 lesson 47 part 2
        for(int i = 8; i!=1; i--){
            System.out.println("$10,000 at " + i +"% interest = $" + String.format("%.2f", calculateInterest(10000, i)));
        }

        //real challenge section5 lesson 47
        int stopPrime = 0;
        for (int n=39; n <= 100; n++){

            if (isPrime(n)){
                stopPrime++;
                System.out.println("Prime = " + n);
                if(stopPrime ==3){
                    break;
                }
            }

        }

        System.out.println("     **********************");


        //section 5 lesson 49 challenge
        System.out.println("Sum of numbers : " + sum3and5Challenge.threeAnd5Sum());

        //////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////// WHILE LOOP ///////////////////////////////////////
        System.out.println("     **********************");

        int count = 0;

        while(count != 6){
            System.out.println("Count Value is " + count);
            count++;
        }

        count = 0;

        while(true){
            if(count == 6) {
                break;
            }
            System.out.println("Count Value is " + count);
            count++;
        }

        count = 0;

        do{
            System.out.println("Count Value is " + count);
            count++;
        }while(count != 6);

        System.out.println("     **********************");

        int testNum = 4;

        while (testNum != 20){
            if (isEvenNumber(testNum)){
                System.out.println(testNum + " is Even");
            }else{
                System.out.println(testNum + " is Odd");
            }
            testNum++;

        }

        //Another way to do the while loop using "continue"
        testNum = 4;

        while(testNum != 20){
            if (!isEvenNumber(testNum)){
                System.out.println(testNum + " is Odd");
                testNum++;
                continue;
            }

            System.out.println(testNum + " is Even");
            testNum++;
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("     **********************");

        System.out.println(Palindrome.reverseNum(23476));

    }

    //real challenge section5 lesson 47

    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }

        for(int i=2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;

    }




    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate/100));

    }


    public static boolean isEvenNumber(int testNumber){
        if (testNumber % 2 == 0 ){
            return true;
        }else{
            return false;
        }
    }






}
