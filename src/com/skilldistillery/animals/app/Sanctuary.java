package com.skilldistillery.animals.app;

import com.skilldistillery.animals.entities.Animal;
import com.skilldistillery.animals.entities.Attendant;

public class Sanctuary {
	
	private Animal[] animal = new Animal[5];
	private Attendant attendant;
	
	public Sanctuary() {
		this.attendant = new Attendant();
	}
	
	public Attendant getAttendant() {
		return attendant;
	}
	
	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}
	
	public void startAttendantRounds() {
		this.attendant.makeRounds(animal);
	}
	
	public void listAnimals() {
		for (int i = 0; i < animal.length; i++) {
			if (animal[i] == null) {
				System.out.println("This enclosure is empty...");
			} else {
				System.out.println(animal[i].getName());
			}
		}
	}
	public void addAnimal(Animal addAnimal) {
		if (animal == null) {
			System.out.println("The sanctuary has no place to keep null!");
		}
		for (int i = 0; i < animal.length; i++) {
			if (this.animal[i] == null) {
				this.animal[i] = addAnimal;
				 System.out.println(addAnimal.getName() + " has been registered. Welcome to the sanctuary!");
				 return;
			}
		} System.out.println("Sorry, the sanctuary is at capacity");
	} 
}
	
	

