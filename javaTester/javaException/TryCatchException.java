package javaException;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchException {
	public static void main(String[] args) {
		FileOutputStream outputStream = null;

		try {
			outputStream = new FileOutputStream("C://automationfc.jpg");
			outputStream.write(65);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void SleepSecond(long timeout) throws InterruptedException {
		Thread.sleep(timeout * 1000);
	}

}
