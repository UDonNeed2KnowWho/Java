package com.sonnyLowe;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Gecko", 1, 5, 1, 5);
	    crestedGecko gecko = new crestedGecko("gecko", 5, 5, 2, 4, true, "lily white");
//        gecko.eat();
//        gecko.climb();
//        gecko.jump();
//        animal.move(5);
        gecko.move(5);

        System.out.println("**************");

        List<String> messages = Arrays.asList("|", "|", "-", "\t", "You");
        System.out.println(messages.get(0));
        System.out.println(messages.get(3));
        System.out.println("|");
    }
}
