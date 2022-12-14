package com.nopcommerce.common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class Common_01_Register_End_User extends BaseTest {

	@Parameters("browser")
	@BeforeTest(description = "Create new Common User for all Classes Test")
	public void Register(String browserName) {
		driver = getBrowserDriver(browserName);
		homePage = PageGeneratorManager.getUserHomePage(driver);

		firstName = "Automation";
		lastName = "FC";
		emailAdress = "afc" + generateRandomNumber() + "@gmail.com";
		validPassword = "123456";

		log.info("Pre-condition - Step 01: Navigate to Register page");
		registerPage = homePage.openRegisterPage();

		log.info("Pre-condition - Step 02: Enter to Firstname textbox with value is " + firstName);
		registerPage.inputToFirstnameTextbox(firstName);

		log.info("Pre-condition - Step 03: Enter to Lastname textbox with value is " + lastName);
		registerPage.inputToLastnameTextbox(lastName);

		log.info("Pre-condition - Step 04: Enter to Email Adrress textbox with value is " + lastName);
		registerPage.inputToEmailTextbox(emailAdress);

		log.info("Pre-condition - Step 05: Enter to Password textbox with value is " + validPassword);
		registerPage.inputToPasswordTextbox(validPassword);

		log.info("Pre-condition - Step 06: Enter to ConfirmPassword textbox with value is " + validPassword);
		registerPage.inputToConfirmPasswordTextbox(validPassword);

		log.info("Pre-condition - Step 07: Click to Register button");
		registerPage.clickToRegisterButton();

		log.info("Pre-condition - Step 08: Verify Register Success Message is displayed");
		verifyEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

		log.info("Pre-condition - Step 09: Click to Logout link");
		homePage = registerPage.clickToLogoutLink();

	}

	@AfterTest
	public void afterClass() {
		driver.quit();
	}

	private WebDriver driver;
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private String firstName, lastName;
	public static String validPassword, emailAdress;

}
