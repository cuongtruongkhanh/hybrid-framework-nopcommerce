package javaOOP.inheritance;

public class Test {
	public static void main(String[] args) {
		HuskyDog dog = new HuskyDog();

		dog.setAge(-15);
		System.out.println(dog.getAge());

		dog.setAge(15);
		System.out.println(dog.getAge());

	}
}
