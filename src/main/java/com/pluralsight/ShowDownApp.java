package com.pluralsight;

public class ShowDownApp {

    public static void main(String[] args) {

        SuperHero invincible = new SuperHero("Invincible", 2000, 1250);
        SuperHero omniMan = new SuperHero("Omni Man", 2500, 1500);
        SuperHero alan = new SuperHero("Alan the Alien", 3000, 1000);
        SuperHero oliver = new SuperHero("Oliver", 500, 100);
        SuperHero thaedus = new SuperHero("Thaedus", 1900, 1100);
        SuperHero battleBeast = new SuperHero("Battle Beast", 5000, 1500);
        SuperHero techJacket = new SuperHero("Tech Jacket", 200, 50);
        SuperVillain thragg = new SuperVillain("Thragg", 100000, 10000);

        while(thragg.isAlive()){
            invincible.fight(thragg);
            omniMan.fight(thragg);
            alan.fight(thragg);
            oliver.fight(thragg);
            thaedus.fight(thragg);
            battleBeast.fight(thragg);
            techJacket.fight(thragg);


        }

        if (thragg.isAlive()){
            System.out.println("Thragg single handily won the Viltrumite war, did you expect anything else?");
        } else {
            System.out.println("Thrag.... lost? Space Racer must have hit him with his lazer on accident.");
        }
    }
}
