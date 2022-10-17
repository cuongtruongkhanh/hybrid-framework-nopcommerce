package javaOOP.polymorphism;

public class Animal {
	public void eat() {
		System.out.println("Animal eating...");
	}

	public Animal timeEat() {
		System.out.println("Time eat ...");
		return new Animal();
	}
}
