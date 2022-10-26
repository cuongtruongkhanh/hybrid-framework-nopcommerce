package com.jquery;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.BaseTest;
import pageObjects.jQuerry.uploadfiles.HomePageObject;

public class Level_11_Upload_Files extends BaseTest {
	private WebDriver driver;
	private HomePageObject homePage;

	String vietnamFileName = "Vietnam.jpg";
	String indonesiaFileName = "Indonesia.jpg";
	String thailandFileName = "Thailan.jpg";
	String[] multipleFiles = { "Vietnam.jpg", "Indonesia.jpg", "Thailand.jpg" };

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
	}

	@Test
	public void Upload_01_One_File_Per_Time() {
		homePage.uploadMultipleFiles(driver, vietnamFileName);
		Assert.assertTrue(homePage.isFileLoadedByName(vietnamFileName));

		homePage.clickToStartButton();
	}

	@Test
	public void Upload_02_Multiple_File_Per_Time() {
		homePage.uploadMultipleFiles(driver, multipleFiles);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
