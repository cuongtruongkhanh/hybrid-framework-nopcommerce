package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;

public class ParrallelClass_03 extends BaseTest {
	WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void beforeMethod(String browserName) {
		driver = getBrowserDriver(browserName);

	}

	@Test
	public void TC_01_New_Product() {

	}

	@Test
	public void TC_02_Edit_Product() {

	}

	@Test
	public void TC_03_View_Product() {

	}

	@Test
	public void TC_04_Search_Product() {

	}

	@Test
	public void TC_05_Delete_Product() {

	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		closeBrowserAndDriver();
	}
}
