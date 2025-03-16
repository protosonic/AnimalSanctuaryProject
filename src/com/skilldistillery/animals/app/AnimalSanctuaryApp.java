package com.skilldistillery.animals.app;

import com.skilldistillery.animals.entities.Panda;
import com.skilldistillery.animals.entities.Penguin;
import com.skilldistillery.animals.entities.Kangaroo;
import java.util.Scanner;

public class AnimalSanctuaryApp {

	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}
	public void launchApp() {
		Scanner sc = new Scanner(System.in);
		Sanctuary sanctuary = new Sanctuary();
		
		Boolean keepGoing = true;
		int userChoice;
		
	while (keepGoing) {
			System.out.println("\nWelcome to Aninmal Sanctuary!\n");
			printMenu();
			userChoice = sc.nextInt();
			
			
			switch(userChoice) {
			case 1: {
				sanctuary.listAnimals();
				sc.nextLine();
				break;
			}
			case 2: {
				System.out.println("Fantastic! We will begin the registration process.\n"
						+ "Please enter the name of the animal\n"
						+ "\nName: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Great! Now which of species of animal is" + name + "?\n"
						+ "1. Panda Bear\n"
						+ "2. Penguin\n"
						+ "3. Kangaroo\n"
						+ "4. Dragon");
				String addChoice = sc.nextLine();
				
				
					switch(addChoice.toLowerCase()) {
					case "1", "panda": {
						Panda newAnimal = new Panda(name);
						sanctuary.addAnimal(newAnimal);
						break;
					}
					case "2", "penguin": {
						Penguin newAnimal = new Penguin(name);
						sanctuary.addAnimal(newAnimal);
						break;
					}
					case "3", "kangaroo": {
						Kangaroo newAnimal = new Kangaroo(name);
						sanctuary.addAnimal(newAnimal);
						break;
					}
					default:
						System.out.println("Sorry " + addChoice + " doesn't seem to be a valid option, please select an animal form the list");
				}
				break;
			}
			case 3: {
				sanctuary.startAttendantRounds();
				continue;
			}
			case 4: {
				System.out.println("Thank you for visiting Animal Sanctuary!");
				keepGoing = false;
				continue;
			}
			}
		} 
	}
	public void printMenu() {
		System.out.println("----------MENU----------");
		System.out.println("1. List current animals");
		System.out.println("2. Add a new animal");
		System.out.println("3. Have attendant feed animals");
		System.out.println("4. Quit");
		System.out.println("------------------------");
	}
}
