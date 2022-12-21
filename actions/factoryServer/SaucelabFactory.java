package factoryServer;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import commons.GlobalConstants;

public class SaucelabFactory {
	private WebDriver driver;
	private String browserName;
	private String osName;

	public SaucelabFactory(String browserName, String osName) {
		this.browserName = browserName;
		this.osName = osName;
	}

	public WebDriver createDriver() {
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("browserName", browserName);
		capability.setCapability("platform", osName);
		capability.setCapability("version", "latest");
		capability.setCapability("screenResolution", "1920x1080");

		try {
			driver = new RemoteWebDriver(new URL(GlobalConstants.SAUCELAB_STACK_URL), capability);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return driver;
	}
}
