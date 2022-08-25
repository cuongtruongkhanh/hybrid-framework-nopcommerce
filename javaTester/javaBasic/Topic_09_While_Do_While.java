package javaBasic;

public class Topic_09_While_Do_While {

	public static void main(String[] args) {
		int i = 0;
		// For
		for (i = 0; i < 5; i++) {
			System.out.println("For: " + i);
		}

		// While

		while (i < 5) {
			System.out.println("While: " + i);
			i++;
		}

		// do while
		// chạy ít nhất 1 lần rồi mới kiểm tra điều kiện
		do {
			System.out.println("do-While: " + i);
			i++;
		} while (i < 5);
	}

}
