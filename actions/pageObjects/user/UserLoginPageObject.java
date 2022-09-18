package pageObjects.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.BasePage;
import common.PageGeneratorManager;
import pageUIs.user.LoginPageUI;

public class UserLoginPageObject extends BasePage {
	private WebDriver driver;
	private WebDriverWait explicitWait;

	public UserLoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public UserLoginPageObject(WebDriver driver, WebDriverWait explicitWait) {
		this.driver = driver;
		this.explicitWait = explicitWait;
	}

	public UserHomePageObject clickToLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManager.getUserHomePage(driver);

	}

	public String getErrorMessageAtEmailTextBox() {
		waitForElementVisible(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);

	}

	public void inputToEmailTextbox(String emailValue) {
		waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, emailValue);

	}

	public String getErrorMessageUnsucessful() {
		waitForElementVisible(driver, LoginPageUI.UNSUCCESSFULL_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.UNSUCCESSFULL_ERROR_MESSAGE);
	}

	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);

	}

	public UserHomePageObject loginAsUser(String emailAddress, String password) {
		inputToEmailTextbox(emailAddress);
		inputToPasswordTextbox(password);
		return clickToLoginButton();
	}

}
