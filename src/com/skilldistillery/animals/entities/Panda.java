package com.skilldistillery.animals.entities;

public class Panda extends Animal {
	private String noise = "\tYawn...\n"; {
	}
	
	public Panda(String name) {
		setName(name);
	}

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eatFood(int amount) {
		System.out.println("\tWhat's this? " + amount + " bamboo shoot" 
						+ (amount > 1 ? "s" : " " ) + "for me? Don't mind if I do!");
	}
}
