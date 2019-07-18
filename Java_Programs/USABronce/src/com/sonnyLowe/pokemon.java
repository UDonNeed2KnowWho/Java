package com.sonnyLowe;

public class pokemon {
    private String name;
    private String type;
    private double weight;
    private double height;
    private String gender;
    private int maxhealth;
    private int health;
    private int combatPower;

    public pokemon(String name, String type, double weight, double height, String gender, int maxhealth, int health, int combatPower) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.maxhealth = maxhealth;
        this.health = health;
        this.combatPower = combatPower;
    }

    public void powerUp(){
        int increase = (int)(combatPower*0.05);
        combatPower += increase;
    }

    public void battle(int damage){
        health -= damage;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getGender() {
        return gender;
    }

    public int getMaxhealth() {
        return maxhealth;
    }

    public int getHealth() {
        return health;
    }

    public int getCombatPower() {
        return combatPower;
    }

    //this is for pokemon program
//        pokemon Flareon = new pokemon("Flareon", "Fire", 3.94, 0.93, "male", 71, 71, 1106);
//        System.out.println(Flareon.getCombatPower());
//        System.out.println("Power Up");
//        Flareon.powerUp();
//        System.out.println(Flareon.getCombatPower());
//        System.out.println("In Battle");
//        Flareon.battle(25);
//        System.out.println(Flareon.getHealth());
    // end of pokemon program
}
