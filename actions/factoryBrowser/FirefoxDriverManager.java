package factoryBrowser;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import commons.GlobalConstants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverManager implements BrowserFactory {

	@Override
	public WebDriver getBrowserDriver() {
		WebDriverManager.firefoxdriver().setup();

		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, GlobalConstants.BROWSER_LOG + "\\FirefoxLog.txt");

		// Add extension to Chrome
		FirefoxProfile profile = new FirefoxProfile();
		File translate = new File(GlobalConstants.PROJECT_PATH + "\\browserExtensions\\to_google_translate-4.2.0.xpi");
		profile.addExtension(translate);
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		options.addPreference("intl.accept_languages", "vi-vn, vi, en-us, en");

		// private
		// options.addArguments("-private");

		return new FirefoxDriver(options);

	}

}
