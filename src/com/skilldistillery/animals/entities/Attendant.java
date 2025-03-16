package com.skilldistillery.animals.entities;

public class Attendant {
	
	public void makeRounds(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			System.out.println("*whistles* I sure do love taking care of my Animals friends...\n");
			if (animals[i] != null) {
				int foodAmount = (int) (Math.random() * 10) +1;
				System.out.println("I will feed " + animals[i].getName() + " " + foodAmount + " foods\n");
				animals[i].makeNoise();
				animals[i].eatFood(foodAmount);
				System.out.println();
			} else {
				System.out.println("This enclosure is empty, on to the next one!\n");
			}
		} System.out.println("Everyone's fed now, I can finally pop a squat!\n");
	}
}
