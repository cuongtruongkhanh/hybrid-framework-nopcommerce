package javaOOP.inheritance;

public class Dog implements Runnable {

	private int age;

	public Dog() {
		System.out.println("Child's constructor");
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			this.age = 0;
		}
	}

	public int getAge() {
		return this.age;
	}
}
