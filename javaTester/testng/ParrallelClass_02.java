package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;

public class ParrallelClass_02 extends BaseTest {
	WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);

	}

	@Test
	public void TC_01_New_User() {

	}

	@Test
	public void TC_02_Edit_User() {

	}

	@Test
	public void TC_03_View_User() {

	}

	@Test
	public void TC_04_Search_User() {

	}

	@Test
	public void TC_05_Delete_User() {

	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver();
	}
}
