package com.skilldistillery.animals.app;

import com.skilldistillery.animals.entities.Animal;
import com.skilldistillery.animals.entities.Attendant;

public class Sanctuary {
	private Animal[] animal = new Animal[5];
	private Attendant attendant;
	public Attendant getAttendant() {
		return attendant;
	}
	
	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}
	// Method that iterates over its Animal array and prints the animal's name,
	// or "This enclosure is empty" if that array element is null.
	public void listAnimals() {
		
	}
	
	
}
