package javaOOP.overriding;

public class Student extends Person implements IWork {
	@Override
	public void eat() {
		System.out.println("Suat com 15k");
	}

	@Override
	public void sleep() {
		System.out.println("Ngu 12 tieng/ngay");
	}

	@Override
	public void workingTime() {
		System.out.println("Hoc 8 tieng/ngay");

	}
}
