package com.exercise.masterp2;

public class Human {
	public int strength = 3;
	public int intelligence = 3;
	public int stealth = 3;
	public int health = 100;
	public int attack (Human oponent ) {
    oponent.health -= this.strength;
    return oponent.health;
	}
}