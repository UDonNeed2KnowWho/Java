package com.sonnyLowe;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random num = new Random();

        // this is random number from 0 - 49. to get 1 - 50, simply do n += 1
        //range is one extra for testing "invalid day" in both methods
        int dayOfTheWeek = num.nextInt(8);

        dayOfTheWeekMethod.printDayOfTheWeekSwitch(dayOfTheWeek);
        System.out.println();
        dayOfTheWeekMethod.printDayOfTheWeekIfElse(dayOfTheWeek);
        System.out.println();

        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actually, the value was: " + switchValue);
                // did not put break statement so default case was continued
            default:
                System.out.println("Was not 1 or 2");
                break;
                //final break not needed but it is clearer if added
        }

        //challenge Section 5, lesson 45

        char switchChar = 'C';

        // way #1
        switch(switchChar) {
            case 'A':
                System.out.println("Character found was: A");
                break;
            case 'B':
                System.out.println("Character found was: B");
                break;
            case 'C':
                System.out.println("Character found was: C");
                break;
            case 'D':
                System.out.println("Character found was: D");
                break;
            case 'E':
                System.out.println("Character found was: E");
                break;

            default:
                System.out.println("Character was not A, B, C, D, or E.");
                break;
        }

        // Way #2

        switch (switchChar){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Character found was: " + switchChar);
                break;
            default:
                System.out.println("Character was not A, B, C, D, or E.");
                break;
        }

        //getting around lowercase/uppercase problems

        String month = "JANuARy";

        //converts everything to lower case
        //make sure cases are in lower case

        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;

            default:
                System.out.println("Did not find the first two months.");
                break;
        }



    }
}
