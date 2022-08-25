package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_09_Excersie {
	Scanner scanner = new Scanner(System.in);

	@Test
	public void runEx() {
//		Ex01();
		Ex05();
	}

	public void Ex01() {

		int i = scanner.nextInt();

		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public void Ex02() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		while (a <= b) {
			if (a % 3 == 0 && a % 5 == 0) {
				System.out.println(a);
			}
			a++;
		}
	}

	public void Ex05() {
		int n = scanner.nextInt();
		int i = 1;
		int giai_thua = 1;
		while (i <= n) {
			giai_thua *= i;
			i++;
		}
		System.out.println(giai_thua);
	}
}
