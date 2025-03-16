package com.skilldistillery.animals.entities;

public class Penguin extends Animal {
	private String noise = "\tChick! Chirp!\n"; {
	}
	
	public Penguin(String name) {
		setName(name);
	}
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eatFood(int amount) {
		System.out.println("\tYummy! I can smell " + amount + " fish" + (amount > 1 ? "es" : " " ));
	}
}
