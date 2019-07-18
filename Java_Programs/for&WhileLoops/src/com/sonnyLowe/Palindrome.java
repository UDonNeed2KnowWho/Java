package com.sonnyLowe;

public class Palindrome {

    public static boolean reverseNum (int originalNum){

        int checkNum = originalNum;
        int reversed = 0;
        int digit = 0;

        while(originalNum != 0){
            digit = originalNum % 10;
            originalNum = originalNum / 10;
            reversed = (reversed * 10) + digit;
            System.out.println(reversed);

        }

        if (reversed == checkNum ){
            return true;
        }else{
            return false;
        }

    }


}
