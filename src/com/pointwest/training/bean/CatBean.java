package com.pointwest.training.bean;

public class CatBean extends AnimalBean {

	public CatBean() {
		this.setPetSound("Meow!");
		this.setPetId(++this.CURRENT_ID);
		this.setPetType("Cat");
	}

	public String getPetGreeting() {
		String greeting = "[" + this.getPetId() + "] " + this.getPetSound() + "... Hi I'm " + this.getName() + " the " + this.getPetType() + ", " + this.getAge()
				+ " years old.";

		return greeting;
	}
}
