package commons;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocalFactory {
	private String browserName;
	private WebDriver driver;

	public LocalFactory(String browserName) {
		this.browserName = browserName;
	}

	public WebDriver createDriver() {
		BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());
		if (browserList == BrowserList.FIREFOX) {
			WebDriverManager.firefoxdriver().setup();

			// Add extension to Chrome
			FirefoxProfile profile = new FirefoxProfile();
			File translate = new File(GlobalConstants.PROJECT_PATH + "\\browserExtensions\\to_google_translate-4.2.0.xpi");
			profile.addExtension(translate);
			FirefoxOptions options = new FirefoxOptions();
			options.setProfile(profile);

			options.addPreference("intl.accept_languages", "vi-vn, vi, en-us, en");

			driver = new FirefoxDriver(options);
		} else if (browserList == BrowserList.H_FIREFOX) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("-headless");
			options.addArguments("window-size=1920x1080");
			driver = new FirefoxDriver(options);
		} else if (browserList == BrowserList.CHROME) {
			WebDriverManager.chromedriver().setup();

			// Add extension to Chrome
			File file = new File(GlobalConstants.PROJECT_PATH + "\\browserExtensions\\extension_2_0_12_0.crx");
			ChromeOptions options = new ChromeOptions();
			options.addExtensions(file);

			// options.addArguments("--lang=vi"); -- Change language
			// options.addArguments("--disable-notifications"); -- disable notification
			// options.addArguments("--disable-geolocation"); -- disable GPS

			// disable popup display automation notification
			options.setExperimentalOption("useAutomationExtension", false);
			options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));

			// Browser in InCognito/ InPrivate mode
			// options.addArguments("--incognito");

			Map<String, Object> prefs = new HashMap<String, Object>();
			// setting not save password
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);

			// setting auto save file
			prefs.put("profile.default_content_settings.popup", 0);
			prefs.put("download.default_directory", GlobalConstants.PROJECT_PATH + "\\downloadFiles");

			options.setExperimentalOption("prefs", prefs);

			driver = new ChromeDriver(options);
		} else if (browserList == BrowserList.H_CHROME) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			driver = new ChromeDriver(options);
		} else if (browserList == BrowserList.EDGE) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserList == BrowserList.OPERA) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		} else if (browserList == BrowserList.COCCOC) {
			// tru di 5-6 version cua Coc Coc thi ra version cua ChromeDriver
			WebDriverManager.chromedriver().driverVersion("104.0.5112.79").setup();
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Program Files\\CocCoc\\Browser\\Application\\browser.exe");
			driver = new ChromeDriver(options);
		} else if (browserList == BrowserList.BRAVE) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
			driver = new ChromeDriver(options);
		} else {
			throw new RuntimeException("Browser name invalid");
		}
		driver.manage().timeouts().implicitlyWait(GlobalConstants.LONG_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(GlobalConstants.PORTAL_DEV_URL);
		return driver;
	}
}
