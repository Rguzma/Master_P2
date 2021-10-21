package com.exercise.masterp2;

public class Wizard extends Human {
	public int intelligence = 8;
	
	public int health = 50;
		

    public int fireball(Human oponent) {
        oponent.health -= (this.intelligence *= 3);
        System.out.println("Wizard used fireball");
        return oponent.health;
    }
    public  int heal (Human partner) {
        partner.health += (this.intelligence);
        System.out.println("Wizard healed partner");
        return partner.health;
    
        
    }
    
}
