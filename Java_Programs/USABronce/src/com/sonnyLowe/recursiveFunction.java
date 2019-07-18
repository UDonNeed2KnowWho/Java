package com.sonnyLowe;

import java.util.Scanner;

public class recursiveFunction {
    public static int[] fibonacci(){

        int[] fibonacciSequence = new int[9];
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;

        for(int i=2; i<= 8; i++){
            fibonacciSequence[i] = fibonacciSequence[i-1] + fibonacciSequence[i-2];
        }

        return fibonacciSequence;
// printing out the class
//        for(int i=0; i<=8; i++) {
//            System.out.println((recursiveFunction.fibonacci()[i]));
//        }

    }
}
