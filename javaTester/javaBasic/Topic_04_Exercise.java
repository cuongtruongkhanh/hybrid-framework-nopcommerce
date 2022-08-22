package javaBasic;

import org.testng.annotations.Test;

public class Topic_04_Exercise {
		
	@Test
	public void RunExercise() {
		//Ex 1
		After15year("Sess", 10);
		
		//Ex 2
		swapNumber(3, 4);
		
		//Ex 3
		compareNumber(4, 4);
		compareNumber(4, 5);
	}
	
	public void After15year(String name, int age) {		
		System.out.println("After 15 years, age of "+name+ " will be "+ (age+15));
	}
	
	public void swapNumber(int a, int b) {
		
		System.out.println("before swap a wil be: " +a);
		System.out.println("before swap b wil be: " +b);
		
		a = a+b;
		b = a - b;
		a = a - b;
		
		System.out.println("after swap a wil be: " +a);
		System.out.println("after swap b wil be: " +b);
	}
	
	public void compareNumber(int a, int b) {
		if(a==b) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
