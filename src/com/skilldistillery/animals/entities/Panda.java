package com.skilldistillery.animals.entities;

public class Panda extends Animal {
	private static String noise = "Yawn..."; {
		System.out.println(noise);
	}
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eatFood(int amount) {
		System.out.println("What's this? " + amount + "bamboo shoot" + (amount > 1 ? "s" : " '" ) + "for me? Don't mind if I do!");
	}
}
