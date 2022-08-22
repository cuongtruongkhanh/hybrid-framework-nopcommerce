package javaBasic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Topic_07_Switch_Case {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	Scanner scanner = new Scanner(System.in);
	
//	@Parameters("browser")
//	@Test
	public void multibrowser(String browser) {
		driver = getBrowserDriver(browser);
		System.out.println(browser);
		
		driver.quit();
	}
	
	@Test
	public void TC02() {
		int month = scanner.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Số ngày là 31");
			break;
		case 2:
			System.out.println("Số ngày là 28 hoặc 29");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Số ngày là 31");
			break;
		default:
			System.out.println("Vui lòng nhập trong khoảng 1-12");
			
		}
	}
	
	public WebDriver getBrowserDriver(String browserName) {
		switch(browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		default:
			new RuntimeException("Please input correct browser name!");
		}
		return driver;
		
	}
	
	

}
