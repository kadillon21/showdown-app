package com.pluralsight;

import java.util.Random;

public class SuperVillain extends Person {

    public SuperVillain(String name, int health, int hatred) {
        super(name, health, hatred);
    }

    public int getHatredLevel(){
        return this.experiencePoints;
    }

    @Override
    public void fight(Person opponent) {
        Random randomNumber = new Random();
        int baseDamage = randomNumber.nextInt(101);


        int damage = baseDamage + this.getHatredLevel();

        if (baseDamage == 0) {
            System.out.println(this.name + " fires a sneaky blast... but misses!");
        } else {
            System.out.println(this.getName() + " hits " + opponent.getName() + " with a sneaky blast for " + damage + " total damage");
            opponent.takeDamage(damage);
        }
    }
}