package javaBasic;

public class Topic_04_Operator {

	public static void main(String[] args) {
		int number = 5;
		
		number += 5;
		number = number + 5;
		
		System.out.println(number);
		
		// 15/5 = 3
		System.out.println(number/5);
		
		// 15%7 = 2 dư 1
		System.out.println(number%7);

		
		System.out.println(number++);
		//In ra number trước: 15
		// ++ = tăng number lên 1: 16
		
		System.out.println(++number);
		// ++ tăng trước number lên 1: 17
		// in ra number: 17
		
		// Tam nguyên: = ? :
		boolean status = (number == 20) ? true: false;
		System.out.println(status);
	}

}
