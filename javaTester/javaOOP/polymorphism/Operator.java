package javaOOP.polymorphism;

public class Operator {

	public void sum(int a, int b) {

	}

	public void sum(double a, double b) {

	}

	public void sum(float a, float b) {

	}

	public void sum(long a, long b) {

	}

	public static void main(String[] args) {
		Operator opr = new Operator();

		opr.sum(5, 8);
		opr.sum(5.5, 7.8);

	}
}
