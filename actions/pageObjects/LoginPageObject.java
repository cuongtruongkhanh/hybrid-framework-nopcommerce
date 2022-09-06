package pageObjects;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import pageUIs.LoginPageUI;

public class LoginPageObject extends BasePage {
	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);

	}

	public String getErrorMessageAtEmailTextBox() {
		waitForElementVisible(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);

	}

	public void inputToEmailTextbox(String emailValue) {
		waitForAllElmentVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, emailValue);

	}

	public String getErrorMessageUnsucessful() {
		// TODO Auto-generated method stub
		return null;
	}

	public void inputToPasswordTextbox(String string) {
		// TODO Auto-generated method stub

	}

}
