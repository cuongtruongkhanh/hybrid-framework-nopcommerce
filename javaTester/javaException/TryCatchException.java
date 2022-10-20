package javaException;

public class TryCatchException {
	public static void main(String[] args) {
		int number = 10;

		try {
			// Đúng: chạy hết đoạn code trong try và không catch
			number = number / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println(number);

		String[] browserName = { "Chrome", "Firefox", "Safari" };

		try {
			browserName[0] = "Edge Chromnium";
			browserName[3] = "IE";

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		for (String browser : browserName) {
			System.out.println(browser);
		}

		try {
			int array[] = new int[10];
			array[9] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Khong chia dc cho 0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index vuot ngoai do dai cua mang");
		}

	}
}
