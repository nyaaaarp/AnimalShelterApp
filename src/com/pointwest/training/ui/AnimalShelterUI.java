package com.pointwest.training.ui;

import java.util.*;
import com.pointwest.training.bean.*;
import com.pointwest.training.utils.*;

public class AnimalShelterUI {

	public boolean displayMenu(List<AnimalBean> petList) {
		String input = "";
		boolean endProgram = false;
		Scanner scanner = new Scanner(System.in);
		AnimalShelterManager manager = new AnimalShelterManager();
		List<String> subMenuList = new ArrayList<String>();

		do {
			System.out.println();
			if (askIfContinue(manager, petList)) {
				System.out.println("Program ends. Goodbye!");
				input = "0";
				endProgram = true;
				scanner.close();
				break;
			}

			System.out.println("HOME PAGE");
			buildSubMenu(petList, manager, subMenuList);
			int subMenuCount = 0;
			for (String message : subMenuList) {
				if (message == null)
					break;
				if (subMenuCount == 0) {
					System.out.println(message);
				} else if (subMenuCount > 0) {
					System.out.println("[" + subMenuCount + "] " + message);
				}
				subMenuCount++;
			}
			System.out.print("Please select an option: ");
			input = scanner.nextLine();

			if ("1".equalsIgnoreCase(input) || "2".equalsIgnoreCase(input) || "3".equalsIgnoreCase(input))
				break;
		} while (true);

		switch (processInput(input,subMenuList)) {
		case "ADD":
			if (!manager.isArrayFull(petList)) {
				manager.addAnimal(this, petList);
				System.out.println("Animal is now added.");
			}
			break;
		case "REMOVE":
			if (!manager.isListEmpty(petList))
				removePet(manager, petList);
			break;
		case "VIEW":
			if (!manager.isListEmpty(petList))
				manager.viewPetList(this, petList);
			break;

		}

		return endProgram;
	}

	private String processInput(String input, List<String> subMenuList) {
		int selection = Integer.parseInt(input);

		String returnCode = "";

		if (subMenuList.get(selection).contains("Add")) {
			returnCode = "ADD";
		} else if (subMenuList.get(selection).contains("Remove")) {
			returnCode = "REMOVE";
		} else if (subMenuList.get(selection).contains("View")) {
			returnCode = "VIEW";
		}

		return returnCode;
	}

	private void buildSubMenu(List<AnimalBean> petList, AnimalShelterManager manager, List<String> subMenuList) {
		subMenuList.clear();
		if (manager.isListEmpty(petList)) {
			subMenuList.add("Welcome to JC's Animal Shelter!\nThe shelter is currently empty.");
		} else {
			subMenuList.add("Welcome to JC's Animal Shelter!");
		}
		if (!manager.isArrayFull(petList)) {
			subMenuList.add("Add an Animal");
		}
		if (!manager.isListEmpty(petList)) {
			subMenuList.add("Remove an Animal");
			subMenuList.add("View all Animals");
		}
	}

	private void removePet(AnimalShelterManager manager, List<AnimalBean> petList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("REMOVE ANIMAL PAGE");
		System.out.print("Please enter reference ID of the animal to remove: ");
		if (manager.removeAnimal(scanner.nextInt(), petList))
			System.out.println("Pet has been removed.");
		else
			System.out.println("Pet not found.");
	}

	public void printPetGreeting(String greeting) {
		System.out.println(greeting);
	}

	public void printViewHeader() {
		System.out.println();
		System.out.println("VIEW PETS PAGE");
	}

	private boolean askIfContinue(AnimalShelterManager manager, List<AnimalBean> petList) {
		boolean endProgram = false;
		Scanner scanner = new Scanner(System.in);
		if (manager.isArrayFull(petList)) {
			System.out.println(
					"The shelter is currently full. We can no longer accept new animals. Do you want to continue?");
			System.out.println("[1] Yes");
			System.out.println("[2] No");
			System.out.print("Enter choice: ");
			switch (scanner.nextLine()) {
			case "1":
				endProgram = false;
				break;
			case "2":
				endProgram = true;
				break;
			}
		}
		return endProgram;
	}

	public String displayPetMenu() {
		String input = "";
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("ADD ANIMAL PAGE");
			System.out.println("What animal are you trying to add?");
			System.out.println("[1] A Dog");
			System.out.println("[2] A Cat");
			System.out.println("[3] A Parrot");
			System.out.print("Enter your choice: ");
			input = scanner.nextLine();
			System.out.println();
			if ("1".equalsIgnoreCase(input) || "2".equalsIgnoreCase(input) || "3".equalsIgnoreCase(input))
				break;
		} while (true);

		return input;
	}

	public String getPetName() {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		System.out.println("Please enter the following details: ");
		System.out.print("Name: ");
		input = scanner.nextLine();

		return input;
	}

	public int getPetAge() {
		int input = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Age: ");
		input = scanner.nextInt();

		return input;
	}

	public String getPetGender() {
		String input = "";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Gender: ");
		input = scanner.nextLine();

		return input;
	}
}
