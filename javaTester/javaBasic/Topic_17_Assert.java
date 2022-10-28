package javaBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Topic_17_Assert {
	WebDriver driver;
	SoftAssert softAsssert;

	@BeforeClass
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	}

	@Test
	public void TC_01_ValidateCurrentUrl() {
		System.out.println("Assert 01");
		String loginPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(loginPageUrl, "https://www.facebook.com/");

		System.out.println("Assert 02");
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle, "Facebook – log in or sign up.");

		System.out.println("Assert 03");
		Assert.assertTrue(driver.findElement(By.xpath("//form[@data-testid='royal_login_form']")).isDisplayed());

		System.out.println("Assert 04");
		Assert.assertTrue(driver.findElement(By.xpath("//form[@data-testid='royal_login_form']")).isDisplayed());

		System.out.println("Assert 05");
		Assert.assertTrue(driver.findElement(By.xpath("//form[@data-testid='royal_login_form']")).isDisplayed());

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
