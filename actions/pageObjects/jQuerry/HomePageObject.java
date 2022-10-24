package pageObjects.jQuerry;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

	public List<String> getValueEachRowAtAllPage() {
		int totalPage = getElementSize(driver, HomePageUI.TOTAL_PAGINATION);
		System.out.println("Total size = " + totalPage);

		List<String> allRowValueAllPage = new ArrayList<String>();

		// Duyệt qua tất cả các page
		for (int i = 1; i <= totalPage; i++) {
			clickToElement(driver, HomePageUI.PAGING_PAGE_BY_NUMBER, String.valueOf(i));

			List<WebElement> allRownElementEachPage = getListWebElement(driver, HomePageUI.ALL_ROW_EACH_PAGE);
			// Get text cua tat ca row mỗi page đưa vào ArrayList
			for (WebElement eachRow : allRownElementEachPage) {
				allRowValueAllPage.add(eachRow.getText());
			}
		}
		// In tất cả giá trị row - tất cả các page
		for (String value : allRowValueAllPage) {
			System.out.println("-----------------------------------");
			System.out.println(value);
		}

		return allRowValueAllPage;
	}

}
