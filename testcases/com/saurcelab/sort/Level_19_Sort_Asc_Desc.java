package com.saurcelab.sort;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;

public class Level_19_Sort_Asc_Desc extends BaseTest {

	@Parameters({ "browser", "appUrl" })
	@BeforeClass
	public void beforeClass(String browserName, String sauceAppUrl) {
		driver = getBrowserDriver(browserName, sauceAppUrl);

	}

	@Test
	public void Sort_01_Name() {

	}

	@Test
	public void User_02_Login() {
	}

	@Test
	public void User_03_My_Account() {
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver();
	}

	WebDriver driver;

}
