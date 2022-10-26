package com.jquery;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.BaseTest;

public class Level_11_Upload_Files extends BaseTest {
	private WebDriver driver;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
	}

	@Test
	public void Table_01_One_File_Per_Time() {
	}

	@Test
	public void Table_02_Multiple_File_Per_Time() {
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
