package javaBasic;

public class Topic_20_Check_Phone_Number {

	public static void main(String[] args) {
		/*
		 * Write a function to check the Phone number format is correct or not. Phone number length is 10, and starts with 7 or 8 or 9.
		 */
		isPhoneNumberCorrect("9876543210");
	}

	public static void isPhoneNumberCorrect(String phoneNumber) {
		boolean status = false;
		System.out.println(phoneNumber.length());
		System.out.println(phoneNumber.charAt(0));

		char firstNumber = 9;
		char secondNumber = 8;
		char thirdNumber = 7;

		int number = Character.compare(firstNumber, phoneNumber.charAt(0));
		System.out.println(number);

		if (status == true) {
			System.out.println("Number is correct");
		} else {
			System.out.println("Number is NOT correct");
		}
	}

}
