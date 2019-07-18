package com.sonnyLowe;
import java.io.*;
import java.util.*;
public class blocks {

    public static int[] getFrequency(String s) {
        int[] blocksNeeded = new int[26];
        for(int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            blocksNeeded[index]++;
        }
        return blocksNeeded;
    }

}
// this is for printing it out
//num = blocks.getFrequency("qwertyuiopasdfghjklzxcvbnm").length;
//        for(int i=0; i<=num-1; i++){
//        System.out.println((blocks.getFrequency("qwertyuiopasdfghjklzxcvbnm")[i]));