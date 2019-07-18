package com.company;

public class kilometersTOmiles {



    public static long toMilesPerHour(double kilometersPerHour){

        //put this in the main code
       /*
        kilometersTOmiles.toMilesPerHour(15);
        kilometersTOmiles.printConversion(15); */

        if(kilometersPerHour < 0){

            System.out.println("-1");
            return -1;

        }else{

            long milesPerHour = (long)(kilometersPerHour / 1.500);
            return (Math.round(milesPerHour));

        }

    }

    public static void printConversion(double kilometersPerHour){

        if(kilometersPerHour < 0){

            System.out.println("Invalid Value");

        }else{


            String milesPerHour = Double.toString(Math.round(kilometersPerHour / 1.5));

            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");


        }

    }


}
