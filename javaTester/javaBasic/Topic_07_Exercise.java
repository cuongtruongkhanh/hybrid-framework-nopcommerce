package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_07_Exercise {
	Scanner scanner = new Scanner(System.in);
	
	@Test
	public void RunEx() {
		//numberInEnglish();
		Operator();
	}
	
	public void numberInEnglish() {
		int i = scanner.nextInt();
		
		switch (i) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 10:
			System.out.println("Ten");
			break;			
		default:
			System.out.println("Please input number from 1 to 10");
			break;
		}
	}
	
	public void Operator() {
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		char operator = scanner.next().charAt(0);
		double result = 0;
		
		switch (operator) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		default:
			System.out.println("illegal operand");
			break;
		}
		System.out.println("Result: "+ result);
	}

}
