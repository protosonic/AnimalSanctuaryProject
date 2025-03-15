package com.skilldistillery.animals.entities;

public class Kangaroo extends Animal {
	private static String noise = "Graborkin!"; {
		System.out.println(noise);
	}
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eatFood(int amount) {
		System.out.println("I reckon this here " + amount + "Herb" + (amount > 1 ? "s" : "" ));
	}
}
