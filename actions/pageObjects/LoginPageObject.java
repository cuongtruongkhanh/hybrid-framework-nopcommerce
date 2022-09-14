package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.BasePage;
import pageUIs.LoginPageUI;

public class LoginPageObject extends BasePage {
	private WebDriver driver;
	private WebDriverWait explicitWait;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPageObject(WebDriver driver, WebDriverWait explicitWait) {
		this.driver = driver;
		this.explicitWait = explicitWait;
	}

	public HomePageObject clickToLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		return new HomePageObject(driver);

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

}
