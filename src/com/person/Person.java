package com.person;

public class Person {
	public String name;
	public int age;
	public String gender;
	public boolean isBreathing = true;
	public int walkSpeed = 30;
	
	Book catInHat = new Book("Cat in the Hat", "Dr. Seuss", "Children", 54);
	
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void read() {
		System.out.println(this.name + " is reading the book titled: " + catInHat.title);
	}
	
	public boolean isStillBreathing() {
		return isBreathing;
	}
	
	public String speak(String msg) {
		return this.name + " says: " + msg;
	}
	
	public int walk() {
		return walkSpeed;
	}
}
