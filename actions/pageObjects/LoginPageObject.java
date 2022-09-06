package pageObjects;

import org.openqa.selenium.WebDriver;

import common.BasePage;

public class LoginPageObject extends BasePage {
	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToLoginButton() {
		// TODO Auto-generated method stub

	}

	public String getErrorMessageAtEmailTextBox() {
		// TODO Auto-generated method stub
		return null;
	}

	public void inputToEmailTextbox(String invalidEmail) {
		// TODO Auto-generated method stub

	}

	public String getErrorMessageUnsucessful() {
		// TODO Auto-generated method stub
		return null;
	}

	public void inputToPasswordTextbox(String string) {
		// TODO Auto-generated method stub

	}

}
