package com.nopcommerce.user;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.BaseTest;
import pageObjects.AddressPageObject;
import pageObjects.CustomerInfoPageObject;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.MyProductReviewPageObject;
import pageObjects.PageGeneratorManager;
import pageObjects.RegisterPageObject;
import pageObjects.RewardPointPageObject;

public class Level_07_Switch_Page extends BaseTest {

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		homePage = PageGeneratorManager.getHomePage(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		firstName = "Automation";
		lastName = "FC";
		emailAdress = "afc" + generateRandomNumber() + "@gmail.com";
		validPassword = "123456";

	}

	@Test
	public void User_01_Register() {
		registerPage = homePage.clickToRegisterLink();
		registerPage.inputToFirstnameTextbox(firstName);
		registerPage.inputToLastnameTextbox(lastName);
		registerPage.inputToEmailTextbox(emailAdress);
		registerPage.inputToPasswordTextbox(validPassword);
		registerPage.inputToConfirmPasswordTextbox(validPassword);
		registerPage.clickToRegisterButton();
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
		homePage = registerPage.clickToLogoutLink();

	}

	@Test
	public void User_02_Login() {
		loginPage = homePage.clickToLoginLink();

		loginPage.inputToEmailTextbox(emailAdress);
		loginPage.inputToPasswordTextbox(validPassword);

		homePage = loginPage.clickToLoginButton();
		Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
	}

	@Test
	public void User_03_Customer_Info() {
		CustomerInfoPage = homePage.clickToMyAccountLink();
		Assert.assertTrue(CustomerInfoPage.isCustomerInfoPageDisplayed());

	}

	@Test
	public void User_04_Switch_Page() {
		// Knowledge cua Page Object
		// Page A khi chuyen qua Page B thi phai viet ham de mo qua page B (action: open/click/ ...)

		// Customer info -> address
		addressPage = CustomerInfoPage.openAddressPage(driver);
		// Address -> My Product review
		myProductReviewPage = addressPage.openMyProductReviewPage();
		// My product review -> Reward point
		rewardPointPage = myProductReviewPage.openRewardPointPage();
		// Reward Point -> Address
		addressPage = rewardPointPage.openAddressPage(driver);

		// Address -> Reward Point
		rewardPointPage = addressPage.openRewardPointPage();
		// Reward Point -> My product review
		myProductReviewPage = rewardPointPage.openMyProductReviewPage();
		// My product review -> Address
		addressPage = myProductReviewPage.openAddressPage(driver);
	}

	@Test
	public void User_05_Switch_Role() {
		// Role user -> role admin

		// Role admin -> role user
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private WebDriver driver;
	private HomePageObject homePage;
	private RegisterPageObject registerPage;
	private LoginPageObject loginPage;
	private CustomerInfoPageObject CustomerInfoPage;
	private AddressPageObject addressPage;
	private RewardPointPageObject rewardPointPage;
	private MyProductReviewPageObject myProductReviewPage;
	private String firstName, lastName, validPassword, emailAdress;

}
