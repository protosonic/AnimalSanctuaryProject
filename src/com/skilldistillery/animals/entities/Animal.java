package com.skilldistillery.animals.entities;

public class Animal {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void makeNoise() {
		System.out.println(" ");
	}
	
	public void eatFood (int amount) {
		System.out.println("I'm eating: " + amount + " food" + (amount < 1 ? "s" : " "));
	}
	

}
