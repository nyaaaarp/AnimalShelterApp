package com.pointwest.training.bean;

public class ParrotBean extends AnimalBean {
	
	public ParrotBean() {
		this.setPetSound("Squawk!");
		this.setPetId(++this.CURRENT_ID);
		this.setPetType("Parrot");
	}
	
	public String getPetGreeting() {
		String greeting = "[" + this.getPetId() + "] " + this.getPetSound() + "... Hi I'm " + this.getName() + " the " + this.getPetType() + ", " + this.getAge()
		+ " years old.";

		return greeting;
	}
}
