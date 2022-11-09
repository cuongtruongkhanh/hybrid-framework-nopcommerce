package javaBasic;

public class Topic_18_Rotate_number {

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] b = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < 10; i++) {
			b[10 - i - 1] = a[i];
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(b[i]);
		}

	}
}