package factoryBrowser;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commons.GlobalConstants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverManager implements BrowserFactory {

	@Override
	public WebDriver getBrowserDriver() {
		WebDriverManager.chromedriver().setup();
		// Add extension to Chrome
		File file = new File(GlobalConstants.PROJECT_PATH + "\\browserExtensions\\extension_2_0_12_0.crx");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(file);
		options.addArguments("--lang=vi"); // Change language
		options.addArguments("--disable-notifications"); // disable notification
		options.addArguments("--disable-geolocation"); // disable GPS
		// disable popup display automation notification
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));

		// Browser in InCognito/ InPrivate mode
		// options.addArguments("--incognito");

		HashMap<String, Object> prefs = new HashMap<String, Object>();
		// setting not save password
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);

		// setting auto save file
		prefs.put("profile.default_content_settings.popup", 0);
		prefs.put("download.default_directory", GlobalConstants.PROJECT_PATH + "\\downloadFiles");

		options.setExperimentalOption("prefs", prefs);
		return new ChromeDriver(options);
	}

}
