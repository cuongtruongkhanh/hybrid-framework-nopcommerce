package javaOOP;

public class Topic_04_Overloading {

	static int plusMethod(int x, int y) {
		return x + y;
	}

	static float plusMethod(float x, float y) {
		return x + y;
	}

	public static void main(String[] args) {
		int z = plusMethod(5, 9);
		float f = plusMethod(5.5f, 6.5f);

		System.out.println(z);
		System.out.println(f);

	}

}
