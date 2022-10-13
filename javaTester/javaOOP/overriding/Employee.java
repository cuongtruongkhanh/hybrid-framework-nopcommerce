package javaOOP.overriding;

public class Employee extends Person implements IWork {
	@Override
	public void eat() {
		System.out.println("suat com 25k");
	}

	@Override
	public void sleep() {
		System.out.println("Ngu 8 tieng/ngay");
	}

	@Override
	public void workingTime() {
		System.out.println("Lam 8 tieng/ngay");

	}

}
