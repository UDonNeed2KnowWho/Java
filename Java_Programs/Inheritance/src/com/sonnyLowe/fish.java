package com.sonnyLowe;

public class fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;
    private String species;

    public fish(String name, int size, int weight, int gills, int eyes, int fins, String species) {
        super(name, 1, size, 1, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
        this.species = species;
    }

    private void rest(){
        System.out.println("fish.rest() called");
    }

    private void moveFins(){
        System.out.println("fish.moveFins() called");
    }

    private void swim(int speed){
        System.out.println("fish.swim() called");
        moveFins();
        super.move(speed);
    }

}
