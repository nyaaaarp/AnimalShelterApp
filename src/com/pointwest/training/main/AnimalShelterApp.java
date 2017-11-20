package com.pointwest.training.main;

import com.pointwest.training.ui.*;
import com.pointwest.training.bean.*;
import java.util.*;

public class AnimalShelterApp {
	public static void main(String[] args) {
		AnimalShelterUI ui = new AnimalShelterUI();
		List<AnimalBean> petList = new ArrayList<AnimalBean>();
		do {
			if (ui.displayMenu(petList))
				break;
		} while (true);
	}
}
