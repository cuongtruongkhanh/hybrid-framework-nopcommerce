package pageObjects;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import pageUIs.MyProductReviewPageUI;

public class MyProductReviewPageObject extends BasePage {
	private WebDriver driver;

	public MyProductReviewPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public RewardPointPageObject openRewardPointPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public AddressPageObject openAddressPage() {
		waitForElementClickable(driver, MyProductReviewPageUI.ADDRESS_LINK);
		clickToElement(driver, MyProductReviewPageUI.ADDRESS_LINK);
		return PageGeneratorManager.getAddressPage(driver);
	}
}
