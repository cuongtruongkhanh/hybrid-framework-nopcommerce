package javaOOP.polymorphism;

public class Bird extends Animal {
	@Override
	public void eat() {
		System.out.println("Bird eating...");
	}

	public Bird born() {
		System.out.println("was born...");
		return new Bird();
	}

}
