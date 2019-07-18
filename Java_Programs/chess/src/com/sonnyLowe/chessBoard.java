package com.sonnyLowe;
import java.util.Arrays;
import java.util.List;

public class chessBoard {


    public static void printBoard(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
        int numSize = numbers.size();
        int stringSize = letters.size();
        System.out.println(numSize);

        for(int num=0; num<=numSize-1; num++){
            for(int let=0; let<=stringSize-1; let++){
                System.out.println("square " + letters.get(let) + numbers.get(num));
            }
        }

    }


}
