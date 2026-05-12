package com.pluralsight;

import java.util.Random;

public class SuperHero extends Person{

    public  SuperHero (String name, int health, int powerLevel){
        super(name, health, powerLevel);
    }

    public int getPowerLevel(){
        return this.experiencePoints;
    }

    @Override
    public void fight(Person opponent){
        Random rand = new Random();
        int baseDamage = rand.nextInt(101);

        int damage = baseDamage + this.getPowerLevel();

        if(baseDamage == 0){
            System.out.println(this.name + " swings heroically... but misses completely!");
        } else {
            System.out.println(this.getName() + " lands a heroic punch on " + opponent.getName() + " dealing " + damage + " total damage.");
            opponent.takeDamage(damage);
        }
    }
}
