package javaBasic;

import org.testng.annotations.Test;

public class Topic_12_Exercise {

	String courseName = "Automation TesTing 19 20 21 AdvaNce";

	@Test
	public void TC_01() {
		char courseNamearr[] = courseName.toCharArray();
		int countUpper = 0;
		int countLower = 0;
		int countNumber = 0;

		for (char character : courseNamearr) {
			// Uppercase
			if (character <= 'Z' && character >= 'A') {
				countUpper++;
			}

			// Lowercase
			if (character <= 'z' && character >= 'a') {
				countLower++;
			}

			// Number
			if (character <= '9' && character >= '0') {
				countNumber++;
			}

		}

		System.out.println("Uppercase = " + countUpper);
		System.out.println("Lowercase = " + countLower);
		System.out.println("Number = " + countNumber);
	}
}
