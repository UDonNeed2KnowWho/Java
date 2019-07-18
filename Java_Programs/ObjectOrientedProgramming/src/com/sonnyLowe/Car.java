package com.sonnyLowe;

public class Car {

    private int doors;
    private int wheels;
    private String color;
    private String model;
    private String engine;

    public void setColor(String color){
        String validColor = color.toLowerCase();
        if(validColor.equals("red") || validColor.equals("blue")){
            this.color = color;
            //typing this. tells the code that the color is the private variable state, not the parameter
        } else{
            this.color = "Invalid";
        }
    }

    public String getColor(){
        return this.color;
    }

}
