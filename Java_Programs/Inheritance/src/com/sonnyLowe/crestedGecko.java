package com.sonnyLowe;

public class crestedGecko extends Animal {
    private int eyes;
    private int legs;
    private boolean tail;
    private String pattern;
    public crestedGecko(String name, int size, int weight, int eyes, int legs, boolean tail, String pattern) {
        super(name, 1, size, 1, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.pattern = pattern;
    }
    private void lick(){
        System.out.println("CrestedGecko.lick() called");
    }

    @Override
    public void eat() {
        System.out.println("CrestedGecko.eat() called");
        lick();
        super.eat();
    }

    public void climb(){
        System.out.println("CrestedGecko.climb() called");
        move(5);
    }
    public void jump(){
        System.out.println("CrestedGecko.jump() called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("CrestedGecko.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("crestedGecko.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    // if you call the move(speed), then it will execute the @Override move method. If super.move(speed) called, will look beyond current class nd execute animal.move method
}
