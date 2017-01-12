package com.java8.streamapi;

public class Person {
	private final String name;
	private final Gender gender;
	private final int age;
	
	public Person(String name, Gender gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() { return name; }
	public Gender getGender() { return gender; }
	public int getAge() { return age; }
	
	@Override
	public String toString() {
		return "Name = " + this.name + " ; Gender = " + this.gender + " ; Age = " + this.age;
	}
}

enum Gender {
	MALE, FEMALE;
}
