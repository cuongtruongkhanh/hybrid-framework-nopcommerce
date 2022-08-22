package javaBasic;

import org.testng.annotations.Test;

public class Topic_08_Exercise {

	@Test
	public void TC_01_for() {
		String[] cityName = { "Ha Noi", "Ho Chi Minh", "Da Nang", "Can Tho" };

		for (int i = 0; i < cityName.length; i++) {
			if (cityName[i].equals("Da Nang")) {
				System.out.println(cityName[i]);
				break;
			}
		}

		for (String city : cityName) {
			System.out.println(city);
		}
		
		
	}

}
