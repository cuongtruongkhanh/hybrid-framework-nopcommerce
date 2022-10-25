package com.jquery.datatable;

import java.util.List;

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
	private WebDriver driver;
	HomePageObject homePage;
	List<String> actualAllCountryValues;
	List<String> expectedAllCountryValues;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		homePage = PageGeneratorManager.getHomePage(driver);
	}

	// @Test
	public void Table_01_Paging() {
		homePage.openPagingByPageNumber("10");
		homePage.SleepInSecond(2);
		Assert.assertTrue(homePage.isPageNumberActived("10"));

		homePage.openPagingByPageNumber("20");
		homePage.SleepInSecond(2);
		Assert.assertTrue(homePage.isPageNumberActived("20"));

		homePage.openPagingByPageNumber("7");
		homePage.SleepInSecond(2);
		Assert.assertTrue(homePage.isPageNumberActived("7"));

		homePage.openPagingByPageNumber("8");
		homePage.SleepInSecond(2);
		Assert.assertTrue(homePage.isPageNumberActived("8"));
	}

	// @Test
	public void Table_02_Enter_To_Header() {
		homePage.refreshCurrentPage(driver);
		homePage.enterToHeaderTextboxByLabel("Country", "Argentina");
		homePage.enterToHeaderTextboxByLabel("Females", "338282");
		homePage.enterToHeaderTextboxByLabel("Males", "349238");
		homePage.enterToHeaderTextboxByLabel("Total", "687522");
		homePage.SleepInSecond(2);

		homePage.enterToHeaderTextboxByLabel("Country", "Angola");
		homePage.enterToHeaderTextboxByLabel("Females", "276880");
		homePage.enterToHeaderTextboxByLabel("Males", "276472");
		homePage.enterToHeaderTextboxByLabel("Total", "553353");
		homePage.SleepInSecond(2);
	}

	// @Test
	public void Table_03_Enter_To_Header() {
		// Đọc dữ liệu từ file contry.txt ra
		// Lưu vào 1 List<String> = Expected Value
		actualAllCountryValues = homePage.getValueCoutryEachRowAtAllPage();
	}

	@Test
	public void Table_04_Enter_To_Textbox_At_Any_Row() {
		// Value de nhap lieu - tham so 1
		// Row number: tai row nao
		// Ex: nhap vao textbox tai dong so 3/5/2
		// Column name: Album/ Artist / Year / Price
		homePage.enterToTextboxAtRowNumberByColumnName("Album", "1", "Titanic");
		homePage.enterToTextboxAtRowNumberByColumnName("Artist", "1", "Michael Jackson");
		homePage.enterToTextboxAtRowNumberByColumnName("Year", "1", "1997");
		homePage.enterToTextboxAtRowNumberByColumnName("Price", "1", "5000");
		homePage.SleepInSecond(2);

		homePage.selectDropdownByColumnNameAtRowNumber("Origin", "1", "Hong Kong");
		homePage.SleepInSecond(2);
		homePage.selectDropdownByColumnNameAtRowNumber("Origin", "1", "Korea");
		homePage.SleepInSecond(2);
		homePage.selectDropdownByColumnNameAtRowNumber("Origin", "1", "Others");
		homePage.SleepInSecond(2);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
