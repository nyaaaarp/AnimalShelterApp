package com.pointwest.training.bean;

public abstract class AnimalBean {
	protected static int CURRENT_ID = 10000;
	protected String name = "";
	protected int age = 0;
	protected String gender = "";
	protected int petId = 0;
	protected String petSound = "";
	protected String petType = "";
	
	public String getPetSound() {
		return petSound;
	}

	public void setPetSound(String petSound) {
		this.petSound = petSound;
	}

	public abstract String getPetGreeting();
	
	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}	
	
}
