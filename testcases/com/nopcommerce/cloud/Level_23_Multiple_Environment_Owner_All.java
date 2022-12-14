package com.nopcommerce.cloud;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nopcommerce.data.UserDataMapper;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.nopCommerce.user.UserCustomerInfoPageObject;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;
import utilities.Environment;

public class Level_23_Multiple_Environment_Owner_All extends BaseTest {
	Environment environment;

	@Parameters({ "server", "browser", "environment", "ipAddress", "portNumber", "os", "osVersion" })
	@BeforeClass
	public void beforeClass(@Optional("local") String serverName, @Optional("chrome") String browserName, @Optional("testing") String environmentName, @Optional("localhost") String ipAddress, @Optional("4444") String portNumber,
			@Optional("Windows") String osName, @Optional("10") String osVersion) {
		ConfigFactory.setProperty("env", environmentName);
		environment = ConfigFactory.create(Environment.class);

		driver = getBrowserDriver(serverName, browserName, environment.appUrl(), ipAddress, portNumber, osName, osVersion);

		System.out.println(environment.appUrl());
		System.out.println(environment.appPassword());
		homePage = PageGeneratorManager.getUserHomePage(driver);
		userDataMapper = UserDataMapper.getUserData();

		firstName = userDataMapper.getFirstName();
		lastName = userDataMapper.getLastName();
		emailAdress = userDataMapper.getEmailAddress() + generateRandomNumber() + "@gmail.com";
		validPassword = userDataMapper.getPassword();
		date = userDataMapper.getDate();
		month = userDataMapper.getMonth();
		year = userDataMapper.getYear();
		companyName = userDataMapper.getCompanyName();

		System.out.printf("Parallel: %s - id: %d \n", Thread.currentThread().getName(), Thread.currentThread().getId());

	}

	@Test
	public void User_01_Register() {

		log.info("Register - Step 01: Navigate to Register page");
		registerPage = homePage.openRegisterPage();

		log.info("Register - Step 02: click to Radio button");
		registerPage.clickToRadioButton(driver, "Male");

		log.info("Register - Step 03: Enter to Firstname textbox with value is " + firstName);
		registerPage.inputToTextboxByID(driver, "FirstName", firstName);

		log.info("Register - Step 04: Enter to Lastname textbox with value is " + lastName);
		registerPage.inputToTextboxByID(driver, "LastName", lastName);

		log.info("Register - Step 05: Select DateOfBirthDay, DateOfBirthMonth, DateOfBirthYear");
		registerPage.selecToDropdownByName(driver, "DateOfBirthDay", date);
		registerPage.selecToDropdownByName(driver, "DateOfBirthMonth", month);
		registerPage.selecToDropdownByName(driver, "DateOfBirthYear", year);

		log.info("Register - Step 06: Enter to Email Adrress textbox with value is " + emailAdress);
		registerPage.inputToTextboxByID(driver, "Email", emailAdress);

		log.info("Register - Step 07: Click to Checkbox Newsletter");
		registerPage.clickToCheckboxByLabel(driver, "Newsletter:");

		log.info("Register - Step 08: Enter to Company textbox with value is " + companyName);
		registerPage.inputToTextboxByID(driver, "Company", companyName);

		log.info("Register - Step 09: Enter to Password textbox with value is " + validPassword);
		registerPage.inputToTextboxByID(driver, "Password", validPassword);

		log.info("Register - Step 10: Enter to ConfirmPassword textbox with value is " + validPassword);
		registerPage.inputToTextboxByID(driver, "ConfirmPassword", validPassword);

		log.info("Register - Step 11: Click to Register button");
		registerPage.clickToButtonByText(driver, "Register");

		log.info("Register - Step 12: Verify Register Success Message is displayed");
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

	}

	// @Test
	public void User_02_Login() {
		log.info("Login - Step 01: Navigate to Login page");
		homePage = registerPage.clickToLogoutLink();
		loginPage = homePage.openLoginPage();

		log.info("Login - Step 02: Enter to email textbox with value is " + emailAdress);
		loginPage.inputToTextboxByID(driver, "Email", emailAdress);

		log.info("Login - Step 03: Enter to password textbox with value is " + validPassword);
		loginPage.inputToTextboxByID(driver, "Password", validPassword);

		log.info("Login - Step 04: Click to login button");
		loginPage.clickToButtonByText(driver, "Log in");
		homePage = PageGeneratorManager.getUserHomePage(driver);

		log.info("Login - Step 05: Verify My Account Link is displayed");
		verifyTrue(homePage.isMyAccountLinkDisplayed());

	}

	// @Test
	public void User_03_My_Account() {
		log.info("MyAccount - Step 01: Navigate to My Account Page");
		customerInfoPage = homePage.openMyAccountPage();

		log.info("MyAccount - Step 02: Verify Customer Info page is displayed");
		verifyTrue(customerInfoPage.isCustomerInfoPageDisplayed());

		log.info("MyAccount - Step 03: Verify First Name value is correct");
		Assert.assertEquals(customerInfoPage.getTextAttributeValueByID(driver, "FirstName"), firstName);

		log.info("MyAccount - Step 04: Verify Last Name value is correct");
		Assert.assertEquals(customerInfoPage.getTextAttributeValueByID(driver, "LastName"), lastName);
		log.info("MyAccount - Step 05: Verify Email value is correct");
		Assert.assertEquals(customerInfoPage.getTextAttributeValueByID(driver, "Email"), emailAdress);
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver();
	}

	private WebDriver driver;
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private UserLoginPageObject loginPage;
	private UserCustomerInfoPageObject customerInfoPage;
	private UserDataMapper userDataMapper;
	private String firstName, lastName, validPassword, emailAdress;
	private String date, month, year, companyName;
}
