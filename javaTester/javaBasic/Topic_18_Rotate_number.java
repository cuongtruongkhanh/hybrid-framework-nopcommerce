package javaBasic;

public class Topic_18_Rotate_number {

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] b = new int[a.length];

		int size = a.length;
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			b[size - i - 1] = a[i];
		}

		for (int i = 0; i < size; i++) {
			System.out.print(b[i]);
		}

	}
}