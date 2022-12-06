package javaBasic;

public class Topic_20_Check_Phone_Number {

	public static void main(String[] args) {
		/*
		 * Write a function to check the Phone number format is correct or not. Phone number length is 10, and starts with 7 or 8 or 9.
		 */
		isPhoneNumberCorrect("0876543210");
	}

	public static void isPhoneNumberCorrect(String phoneNumber) {
		System.out.println(phoneNumber.length());
		System.out.println(phoneNumber.charAt(0));

		if (phoneNumber.startsWith("7") == true || phoneNumber.startsWith("8") == true || phoneNumber.startsWith("9") == true) {
			if (phoneNumber.length() == 10) {
				System.out.println("Number is correct");
			} else {
				System.out.println("Number is NOT correct");
			}
		} else {
			System.out.println("Number is NOT correct");
		}

	}

}
