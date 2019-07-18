package com.sonnyLowe;

public class moo {
    public static String check(int n){
        //   2     .4     6   .8  10 .12   14  .16
      //   3 4 3  5  3  4  3  6 3 4 3 7 3  4 3 8
       // 1,4,8,11,16,19,23,26,32
        int checker = 1;
        int increase = 5;

        for(int i = 1 ; checker <= n ; i++){
            if(checker==n){
                return "m";
            }else{
                if(i % 2 > 0) {
                    checker = checker + 3;
                }else if(i % 4 != 0){
                    checker = checker + 4;
                }else if(i%4 == 0){
                    checker = checker + increase;
                    increase++;
                }
                System.out.println(checker);
            }
        }
        return "o";
    }


    // printing it out
//    public static void main(String[] args) {
////        System.out.println(moo.check(16));
////    }
}
