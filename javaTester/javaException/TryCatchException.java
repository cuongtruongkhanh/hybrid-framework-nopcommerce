package javaException;

public class TryCatchException {
	public static void main(String[] args) {
		int number = 10;

		try {
			// Đúng: chạy hết đoạn code trong try và không catch
			number = number / 0;
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
