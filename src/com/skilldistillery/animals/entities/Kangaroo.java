package com.skilldistillery.animals.entities;

public class Kangaroo extends Animal {
	private String noise = "\tGraborkin!\n"; {
	}
	
	public Kangaroo (String name) {
		setName(name);
	}
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eatFood(int amount) {
		System.out.println("\tI reckon this here " + amount + " herb" + (amount > 1 ? "s" : " " ));
	}
}
