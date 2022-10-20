package javaException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HandleException {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\automationfc.jpg");

		FileReader fr = new FileReader(file);
		fr.close();
	}
}
