package com.exercise.masterp2;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human w = new Human();
		Human s = new Human ();
		Human n= new Human ();
		Human o = new Human();
		
		
		w.fireball (o);
		System.out.println(o.health);
		w.heal(o);
		System.out.println(o.health);
	}
	
}
