package com.pluralsight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ShowDownApp {

    public static void main(String[] args) {

        SuperHero invincible = new SuperHero("Invincible", 2000, 1250);
        SuperHero omniMan = new SuperHero("Omni Man", 2500, 1500);
        SuperHero alan = new SuperHero("Alan the Alien", 3000, 1000);
        SuperHero oliver = new SuperHero("Oliver", 500, 100);
        SuperHero thaedus = new SuperHero("Thaedus", 1900, 1100);
        SuperHero battleBeast = new SuperHero("Battle Beast", 5000, 1500);
        SuperHero techJacket = new SuperHero("Tech Jacket", 200, 50);
        SuperVillain thragg = new SuperVillain("Thragg", 50000, 5000);
        ArrayList<SuperHero> heroes = new ArrayList<>();
        heroes.add(invincible);
        heroes.add(omniMan);
        heroes.add(alan);
        heroes.add(oliver);
        heroes.add(thaedus);
        heroes.add(battleBeast);
        heroes.add(techJacket);

        Random rand = new Random();
        while(thragg.isAlive() && !heroes.isEmpty()){

            Iterator<SuperHero> it = heroes.iterator();
            while (it.hasNext()){
                SuperHero hero = it.next();
                if(!hero.isAlive()){
                    System.out.println(hero.getName() + " has been slain...");
                    it.remove();
                } else {
                    hero.fight(thragg);
                }
            }


        /*
        Original attempt to remove heroes from list threw exception error
            for (SuperHero hero : heroes){
                if (!hero.isAlive()){
                    heroes.remove(hero);
                    System.out.println(hero.name + " has been slain...");
                } else {
                    hero.fight(thragg);
                }
            }
        */

            if(!heroes.isEmpty()) {
                int randIndex = rand.nextInt(heroes.size());
                thragg.fight(heroes.get(randIndex));
            }

        }

        if (thragg.isAlive()){
            System.out.println(thragg.getName() + " single handily won the Viltrumite war, did you expect anything else?");
        } else {
            System.out.println(thragg.getName() + " ... lost? must have been luck.");
        }
    }
}
