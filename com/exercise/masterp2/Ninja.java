package com.exercise.masterp2;

public class Ninja extends Human {
    public Ninja() {
        this.stealth = 10;
    }
    public  void steal(Human oponent) {
    	oponent.health -= this.stealth;
    	this.health += this.stealth;
        System.out.println("Ninja used steal");
		
	}
    public  void runAway() {
        this.health -= 10;
    }
}
