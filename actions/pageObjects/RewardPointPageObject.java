package pageObjects;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import pageUIs.RewardPointPageUI;

public class RewardPointPageObject extends BasePage {
	private WebDriver driver;

	public RewardPointPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public AddressPageObject openAddressPage() {
		waitForElementClickable(driver, RewardPointPageUI.ADDRESS_LINK);
		clickToElement(driver, RewardPointPageUI.ADDRESS_LINK);
		return PageGeneratorManager.getAddressPage(driver);
	}

	public MyProductReviewPageObject openMyProductReviewPage() {
		// TODO Auto-generated method stub
		return null;
	}
}
