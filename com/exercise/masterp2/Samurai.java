package com.exercise.masterp2;

public class Samurai extends Human {
    private static int numSamurai = 0;
    public int health = 200;
    public static int howMany() {
        return Samurai.numSamurai;
		
	}
    public int deathBlow(Human oponent) {
        oponent.health = 0;
        return oponent.health;
    }
    public int deathBlow(int health) {
        this.health -= (this.health/2);
        System.out.println("Samurai used death blow");
        return this.health;
    }
    public int meditate () {
        if (this.health < 200) {
        	do{ this.health ++;
        	}
        	while (this.health < 200);
        	System.out.println("Samurai used meditate");
        	return this.health;
        	}
        System.out.println("Samurai used meditate");
        return this.health;
        }
    
}
