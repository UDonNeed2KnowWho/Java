package com.company;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        System.out.println(getDurationString(61));

    }




    public static String getDurationString(int minutes, int seconds){

        if (minutes < 0 || seconds < 0) {
            return "Invalid Numbers";
        }else {

            int newSeconds = seconds % 60;
            int newMinutes = (minutes % 60) + (((seconds - newSeconds) / 60) % 60);
            int newHours = ((minutes - (minutes % 60)) / 60) + (((seconds - newSeconds - (newMinutes - (minutes % 60)))/60)/60);

            System.out.println(newHours+"h "+newMinutes+"m "+newSeconds+"s ");
            return (newHours+"h "+newMinutes+"m "+newSeconds+"s ");

        }
    }

    public static String getDurationString(int seconds){

        if (seconds < 0){
            return "Invalid Numbers";
        }else {
            int newSeconds = seconds % 60;
            int newMinutes = (seconds - newSeconds) / 60;

            getDurationString(newMinutes, newSeconds);
            return (newMinutes+"m "+newSeconds+"s ");

        }

    }




}




