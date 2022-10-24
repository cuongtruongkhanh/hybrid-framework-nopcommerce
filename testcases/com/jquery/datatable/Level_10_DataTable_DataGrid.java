package com.jquery.datatable;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.BaseTest;
import pageObjects.jQuerry.HomePageObject;
import pageObjects.jQuerry.PageGeneratorManager;

public class Level_10_DataTable_DataGrid extends BaseTest {
	HomePageObject homePage;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		homePage = PageGeneratorManager.getHomePage(driver);
	}

	@Test
	public void Table_01_Paging() {
		homePage.openPagingByPageNumber("10");
		homePage.SleepInSecond(3);
		Assert.assertTrue(homePage.isPageNumberActived("10"));

		homePage.openPagingByPageNumber("20");
		homePage.SleepInSecond(3);
		Assert.assertTrue(homePage.isPageNumberActived("20"));

		homePage.openPagingByPageNumber("7");
		homePage.SleepInSecond(3);
		Assert.assertTrue(homePage.isPageNumberActived("7"));

		homePage.openPagingByPageNumber("8");
		homePage.SleepInSecond(3);
		Assert.assertTrue(homePage.isPageNumberActived("8"));
	}

	// @Test
	public void Table_02_Enter_To_Header() {
		homePage.refreshCurrentPage(driver);
		homePage.enterToHeaderTextboxByLabel("Country", "Argentina");
		homePage.enterToHeaderTextboxByLabel("Females", "338282");
		homePage.enterToHeaderTextboxByLabel("Males", "349238");
		homePage.enterToHeaderTextboxByLabel("Total", "687522");
		homePage.SleepInSecond(3);

		homePage.enterToHeaderTextboxByLabel("Country", "Angola");
		homePage.enterToHeaderTextboxByLabel("Females", "276880");
		homePage.enterToHeaderTextboxByLabel("Males", "276472");
		homePage.enterToHeaderTextboxByLabel("Total", "553353");
		homePage.SleepInSecond(3);
	}

	// @Test
	public void Table_03_Enter_To_Header() {

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private WebDriver driver;

}
