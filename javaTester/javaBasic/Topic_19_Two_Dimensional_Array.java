package javaBasic;

public class Topic_19_Two_Dimensional_Array {
	public static void main(String[] args) {
		twoDimensions(3, 5);
	}

	static void twoDimensions(int i, int j) {
		int list[][] = new int[i][j];
		for (int a = 0; a < i; a++) {
			System.out.print("[");
			for (int b = 0; b < j; b++) {
				list[a][b] = (a * b);
				System.out.print(list[a][b]);
			}
			System.out.print("]");
		}
	}
}
