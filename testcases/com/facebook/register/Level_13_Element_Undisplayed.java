package com.facebook.register;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;

public class Level_13_Element_Undisplayed extends BaseTest {
	private WebDriver driver;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
	}

	@Test
	public void TC_01_Verify_Element_Displayed() {

	}

	@Test
	public void TC_02_Verify_Element_Undisplayed_In_DOM() {

	}

	@Test
	public void TC_03_Verify_Element_Undisplayed_Not_In_DOM() {

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
