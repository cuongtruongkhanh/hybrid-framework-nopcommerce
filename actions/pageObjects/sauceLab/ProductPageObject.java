package pageObjects.sauceLab;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.BasePage;
import pageUIs.sauceLab.ProductPageUI;

public class ProductPageObject extends BasePage {
	WebDriver driver;

	public ProductPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void selectItemInProductSortDropdown(String itemValue) {
		waitForElementClickable(driver, ProductPageUI.PRODUCT_CONTAINER_DROPDOWN);
		selectItemInDefaultDropdown(driver, ProductPageUI.PRODUCT_CONTAINER_DROPDOWN, itemValue);

	}

	public boolean isProductNameSortByAscending() {
		ArrayList<String> productNameList = new ArrayList<>();
		List<WebElement> productNames = driver.findElements(By.xpath(ProductPageUI.PRODUCT_NAMES));

		for (WebElement productName : productNames) {
			productNameList.add(productName.getText());
		}

		return false;
	}
}
