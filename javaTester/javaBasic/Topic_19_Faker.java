package javaBasic;

import java.util.Locale;

import com.github.javafaker.Faker;

public class Topic_19_Faker {

	public static void main(String[] args) {
		Faker faker = new Faker();

		System.out.println(faker.gameOfThrones().character());
		System.out.println(faker.gameOfThrones().dragon());
		System.out.println(faker.pokemon().name());

		Faker fakeVi = new Faker(new Locale("vi"));

		System.out.println(fakeVi.address().city());
		System.out.println(fakeVi.address().city());
		System.out.println(fakeVi.address().city());
		System.out.println(fakeVi.address().city());
		System.out.println(fakeVi.address().city());
		System.out.println(fakeVi.address().city());
		System.out.println(fakeVi.address().city());

		// Firstname / Lastname / Email / City / Phone / Address / State / Pin / Zip Code / Country
	}

}
