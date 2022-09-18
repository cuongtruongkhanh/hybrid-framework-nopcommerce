package com.nopcommerce.user;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.BaseTest;
import common.GlobalConstants;
import common.PageGeneratorManager;
import pageObjects.admin.AdminDashboardPageObject;
import pageObjects.admin.AdminLoginPageObject;
import pageObjects.user.UserHomePageObject;
import pageObjects.user.UserLoginPageObject;
import pageObjects.user.UserRegisterPageObject;

public class Level_08_Switch_Role extends BaseTest {

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		userHomePage = PageGeneratorManager.getUserHomePage(driver);
		firstName = "Automation";
		lastName = "FC";
		userEmailAddress = "afc" + generateRandomNumber() + "@gmail.com";
		userPassword = "123456";
		adminEmailAddress = "admin@yourstore.com";
		adminPassword = "admin";
	}

	@Test
	public void Role_01_User_To_Admin() {
		registerPage = userHomePage.openRegisterPage();
		registerPage.inputToFirstnameTextbox(firstName);
		registerPage.inputToLastnameTextbox(lastName);
		registerPage.inputToEmailTextbox(userEmailAddress);
		registerPage.inputToPasswordTextbox(userPassword);
		registerPage.inputToConfirmPasswordTextbox(userPassword);
		registerPage.clickToRegisterButton();

		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
		userHomePage = registerPage.clickToLogoutLink();

		userLoginPage = userHomePage.openLoginPage();

		userHomePage = userLoginPage.loginAsUser(userEmailAddress, userPassword);

		Assert.assertTrue(userHomePage.isMyAccountLinkDisplayed());
	}

	@Test
	public void Role_02_Admin_To_User() {
		userHomePage.openPageUrl(driver, GlobalConstants.ADMIN_PAGE_URL);
		adminLoginPage = PageGeneratorManager.getAdminLoginPage(driver);

		// login as Admin Role
		adminDashboardPage = adminLoginPage.loginAsAdmin(adminEmailAddress, adminPassword);
		Assert.assertTrue(adminDashboardPage.isDashboardHeaderDisplayed());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private WebDriver driver;
	private UserHomePageObject userHomePage;
	private UserRegisterPageObject registerPage;
	private UserLoginPageObject userLoginPage;
	private AdminLoginPageObject adminLoginPage;
	private AdminDashboardPageObject adminDashboardPage;
	private String firstName, lastName, userPassword, userEmailAddress, adminEmailAddress, adminPassword;

}
