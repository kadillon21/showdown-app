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
        double randomness = randomNumber.nextDouble(0.1, 1);


        int damage = (int) (randomness * this.getHatredLevel());

        System.out.println(this.getName() + " hits " + opponent.getName() + " with an impactful blast for " + damage + " total damage");
        opponent.takeDamage(damage);

    }

}