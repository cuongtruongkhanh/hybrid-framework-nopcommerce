package pageObjects;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import pageUIs.CustomerInfoPageUI;

public class CustomerInfoPageObject extends BasePage {
	private WebDriver driver;

	public CustomerInfoPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isCustomerInfoPageDisplayed() {
		waitForElementVisible(driver, CustomerInfoPageUI.CUSTOMER_INFO_HEADER);
		return isElementDisplayed(driver, CustomerInfoPageUI.CUSTOMER_INFO_HEADER);
	}

	public AddressPageObject openAddressPage() {
		waitForElementClickable(driver, CustomerInfoPageUI.ADDRESS_LINK);
		clickToElement(driver, CustomerInfoPageUI.ADDRESS_LINK);
		return PageGeneratorManager.getAddressPage(driver);
	}
}
