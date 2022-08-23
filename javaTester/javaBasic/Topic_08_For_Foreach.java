package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_08_For_Foreach {
	Scanner scanner = new Scanner(System.in);
	
	@Test
	public void RunExFor() {
		//Ex01();
		//Ex02();
		//Ex03();
		Ex04();
	}
	
	public void Ex01() {
		int number = scanner.nextInt();
		
		for(int i=1; i<=number; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void Ex02() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		for(int i=a; i<=b; i++) {
			System.out.print(i + " ");
		}
		
	}

	public void Ex03() {
		int a = scanner.nextInt();
		int s = 0;
		for(int i=1; i<=a; i++) {
			if(i%2==0) {
				s += i;
			}
		}
		System.out.println(s);
		
	}
	
	public void Ex04() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = 0;
		
		for(int i=a; i<=b; i++) {
			c += i;
		}
		System.out.println(c);
	}

	
	
}
