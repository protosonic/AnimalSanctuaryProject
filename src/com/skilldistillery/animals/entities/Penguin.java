package com.skilldistillery.animals.entities;

public class Penguin extends Animal {
	private static String noise = "Chick! Chirp!"; {
		System.out.println(noise);
	}
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eatFood(int amount) {
		System.out.println("Yummy! I can smell " + amount + "fish" + (amount > 1 ? "es" : "" ));
	}
}
