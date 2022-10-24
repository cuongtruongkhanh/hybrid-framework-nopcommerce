package pageObjects.jQuerry;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import common.BasePage;
import pageUIs.jQuerry.HomePageUI;

public class HomePageObject extends BasePage {
	WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void openPagingByPageNumber(String pageNumber) {
		waitForElementClickable(driver, HomePageUI.PAGING_PAGE_BY_NUMBER, pageNumber);
		clickToElement(driver, HomePageUI.PAGING_PAGE_BY_NUMBER, pageNumber);
	}

	public void enterToHeaderTextboxByLabel(String headerLabel, String value) {
		waitForAllElmentVisible(driver, HomePageUI.HEADER_TEXTBOX_BY_LABEL, headerLabel);
		sendKeyToElement(driver, HomePageUI.HEADER_TEXTBOX_BY_LABEL, value, headerLabel);
		pressKeyToElement(driver, HomePageUI.HEADER_TEXTBOX_BY_LABEL, Keys.ENTER, headerLabel);
	}

	public boolean isPageNumberActived(String pageNumber) {
		waitForElementVisible(driver, HomePageUI.PAGING_PAGE_ACTIVED_BY_NUMBER, pageNumber);
		return isElementDisplayed(driver, HomePageUI.PAGING_PAGE_ACTIVED_BY_NUMBER, pageNumber);
	}

}
