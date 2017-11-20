package com.pointwest.training.bean;

public class DogBean extends AnimalBean {
	
	public DogBean() {
		this.setPetSound("Woof!");
		this.setPetId(++this.CURRENT_ID);
		this.setPetType("Dog");
	}
	
	public String getPetGreeting() {
		String greeting = "[" + this.getPetId() + "] " + this.getPetSound() + "... Hi I'm " + this.getName() + " the " + this.getPetType() + ", " + this.getAge()
		+ " years old.";
		
		return greeting;
	}
}
