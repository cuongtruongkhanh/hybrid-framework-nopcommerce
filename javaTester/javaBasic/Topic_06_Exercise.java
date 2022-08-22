package javaBasic;

import org.testng.annotations.Test;

public class Topic_06_Exercise {

	@Test
	public void Exercise() {
//		Ex01(3);
//		Ex02(3,4);
//		Ex03("John", "John");
//		Ex04(4,7,3);
//		Ex05(9);
//		Ex05(50);
//		Ex05(101);
//		Ex06(11.5);
//		Ex06(7.5);
		Ex07(5);
	}
	
	
	public void Ex01(int n) {
		String evenodd = (n%2==0) ? "n is even number": "n is odd number";	
		System.out.println(evenodd);
	}
	
	public void Ex02(int a, int b) {
		String compare = (a>b) ? "a is higher than b": "a is lower than b";
		System.out.println(compare);
	}
	
	public void Ex03(String a, String b) {
		String nameCompare = (a.equals(b)) ? "a and b are the same":"a and b are NOT the same";
		System.out.println(nameCompare);
	}
	
	public void Ex04(int a, int b, int c) {
		int n = (a>b) ? a:b;
		n = (n>c)? n:c;
		System.out.println("Highest number is: "+n);
	}
	
	public void Ex05(int a) {
		String result = (a>=10)&&(a<=100) ? "the number is in rage": "the number is out of range";
		System.out.println(result);
	}

	public void Ex06(double a) {
		if (a<5) {
			System.out.println("Grade D");
		} else if (a>=5&&a<7.5){
			System.out.println("Grade C");
		} else if (a>=7.5&&a<8.5) {
			System.out.println("Grade B");
		} else if (a>=8.5&&a<=10) {
			System.out.println("Grade A");
		} else {
			System.out.println("Please input correct number");
		}
	}
	
	public void Ex07(int a) {
		switch (a) {
		case 1:
			System.out.println("Số ngày là 31");
			break;
		case 2:
			System.out.println("Số ngày là 28 hoặc 29");
			break;
		case 3:
			System.out.println("Số ngày là 31");
			break;
		case 4:
			System.out.println("Số ngày là 30");
			break;
		case 5:
			System.out.println("Số ngày là 31");
			break;
		case 6:
			System.out.println("Số ngày là 30");
			break;
		case 7:
			System.out.println("Số ngày là 31");
			break;
		case 8:
			System.out.println("Số ngày là 31");
			break;
		case 9:
			System.out.println("Số ngày là 30");
			break;
		case 10:
			System.out.println("Số ngày là 31");
			break;
		case 111:
			System.out.println("Số ngày là 30");
			break;
		case 12:
			System.out.println("Số ngày là 31");
			break;
					

		}
	}
}
