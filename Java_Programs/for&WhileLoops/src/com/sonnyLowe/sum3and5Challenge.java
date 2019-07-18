package com.sonnyLowe;

public class sum3and5Challenge {

    public static int threeAnd5Sum(){
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++){
            if( (i % 5 == 0) && (i % 3 == 0) ){
                System.out.println("Found number : " + i);
                sum += i;
                count ++;

                if (count == 5){
                    break;
                }
            }
        }
        return sum;
    }

}
