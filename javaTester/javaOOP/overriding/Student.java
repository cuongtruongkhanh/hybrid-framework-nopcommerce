package javaOOP.overriding;

public class Student extends Person {
	@Override
	public void eat() {
		System.out.println("Suat com 15k");
	}

	@Override
	public void sleep() {
		System.out.println("Ngu 12 tieng/ngay");
	}
}
