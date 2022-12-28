package factoryServer;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import factoryBrowser.BrowserList;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GridFactory {
	private String browserName, ipAddress, portNumber;
	private WebDriver driver;

	public GridFactory(String browserName, String ipAddress, String portNumber) {
		this.browserName = browserName;
		this.browserName = ipAddress;
		this.browserName = portNumber;
	}

	public WebDriver createDriver() {
		BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());
		DesiredCapabilities capability = new DesiredCapabilities();

		if (browserList == BrowserList.FIREFOX) {
			WebDriverManager.firefoxdriver().setup();
			capability = DesiredCapabilities.firefox();
			capability.setBrowserName("firefox");
			capability.setPlatform(Platform.ANY);

			FirefoxOptions options = new FirefoxOptions();
			options.merge(capability);
		} else if (browserList == BrowserList.CHROME) {
			WebDriverManager.chromedriver().setup();
			capability = DesiredCapabilities.chrome();
			capability.setBrowserName("chrome");
			capability.setPlatform(Platform.ANY);

			ChromeOptions options = new ChromeOptions();
			options.merge(capability);
		} else if (browserList == BrowserList.EDGE) {
			WebDriverManager.edgedriver().setup();
			capability = DesiredCapabilities.chrome();
			capability.setBrowserName("edge");
			capability.setPlatform(Platform.ANY);

			EdgeOptions options = new EdgeOptions();
			options.merge(capability);
		} else if (browserList == BrowserList.SAFARI) {
			capability = DesiredCapabilities.safari();
			capability.setBrowserName("safari");
			capability.setJavascriptEnabled(true);
			capability.setPlatform(Platform.ANY);
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
		try {
			driver = new RemoteWebDriver(new URL(String.format("http://%s:%s/wd/hub", ipAddress, portNumber)), capability);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return driver;
	}
}
