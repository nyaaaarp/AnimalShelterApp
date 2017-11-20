package com.pointwest.training.utils;

import java.util.*;
import com.pointwest.training.bean.*;
import com.pointwest.training.ui.*;

public class AnimalShelterManager {

	public void addAnimal(AnimalShelterUI ui, List<AnimalBean> petList) {
		AnimalBean addedAnimal = null;

		switch (ui.displayPetMenu()) {
		case "1":
			addedAnimal = new DogBean();
			break;
		case "2":
			addedAnimal = new CatBean();
			break;
		case "3":
			addedAnimal = new ParrotBean();
			break;
		}

		addCharacteristics(ui, addedAnimal);
		petList.add(addedAnimal);
	}

	private void addCharacteristics(AnimalShelterUI ui, AnimalBean addedPet) {

		addedPet.setName(ui.getPetName());
		addedPet.setAge(ui.getPetAge());
		addedPet.setGender(ui.getPetGender());
	}

	public boolean removeAnimal(int refId, List<AnimalBean> petList) {
		boolean removedPet = false;
		for (AnimalBean pet : petList) {
			if (pet.getPetId() == refId) {
				removedPet = true;
				petList.remove(pet);
				break;
			}
			if (petList.isEmpty())
				break;
		}
		return removedPet;
	}

	public boolean isArrayFull(List<AnimalBean> petList) {
		boolean arrayIsFull = false;
		if (petList.size() >= 10) {
			arrayIsFull = true;
		}
		return arrayIsFull;
	}

	public boolean isListEmpty(List<AnimalBean> petList) {
		return petList.isEmpty();
	}

	public void viewPetList(AnimalShelterUI ui, List<AnimalBean> petList) {

		ui.printViewHeader();
		for (AnimalBean pet : petList) {
			ui.printPetGreeting(pet.getPetGreeting());
		}
	}
}
