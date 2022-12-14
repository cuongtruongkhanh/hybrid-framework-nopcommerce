package commons;

import java.io.File;

public class GlobalConstants {
	// Dev
	public static final String PORTAL_DEV_URL = "https://demo.nopcommerce.com/";
	public static final String ADMIN_DEV_URL = "https://admin-demo.nopcommerce.com";

	// TESTING
	public static final String PORTAL_TESTING_URL = "https://demo.nopcommerce.com/";
	public static final String ADMIN_TESTING_URL = "https://admin-demo.nopcommerce.com";

	// STAGING
	// public static final String PORTAL_TESTING_URL = "https://demo.nopcommerce.com/";
	// public static final String ADMIN_TESTING_URL = "https://admin-demo.nopcommerce.com";

	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String OS_NAME = System.getProperty("os.name");
	public static final String JAVA_VERSION = System.getProperty("java.version");;
	public static final String UPLOAD_FILE = PROJECT_PATH + File.separator + "uploadFiles" + File.separator;

	// trỏ về thư mục mặc định của user
	// Window: Downloads
	public static final String DOWNLOAD_FILE = PROJECT_PATH + File.separator + "downloadFiles";
	public static final String BROWSER_LOG = PROJECT_PATH + File.separator + "browserLogs";
	public static final String DRAG_DROP_HTML5 = PROJECT_PATH + File.separator + "dragDropHTML5";
	public static final String AUTO_IT_SCRIPT = PROJECT_PATH + File.separator + "autoIT";
	public static final String REPORTING_SCREENSHOT = PROJECT_PATH + File.separator + "reportNGImages" + File.separator;

	public static final String BROWSER_USERNAME = "khanhcuong_NYbcKG";
	public static final String BROWSER_AUTOMATE_ACCESS_KEY = "MwY9ugky321yaiH39KCR";
	public static final String BROWSER_STACK_URL = "https://" + BROWSER_USERNAME + ":" + BROWSER_AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static final String SAUCELAB_USERNAME = "oauth-khanhcuong.hanu-34976";
	public static final String SAUCELAB_AUTOMATE_ACCESS_KEY = "65b4d8a0-91ee-4d11-9a90-5f4657c46fa9";
	public static final String SAUCELAB_STACK_URL = "https://" + SAUCELAB_USERNAME + ":" + SAUCELAB_AUTOMATE_ACCESS_KEY + "@ondemand.apac-southeast-1.saucelabs.com:443/wd/hub";

	// Popup lên mới upload
	// Headless browser
	// Jenkins service (File cài đặt) - Headless
	// Jenkins (.war) - Bật browser

	// Database Account / User/ Pass / Port
	public static final String DB_DEV_URL = "32.18.252.185:9860";
	public static final String DB_DEV_USER = "automationfc";
	public static final String DB_DEV_PASS = "^*^*!!";

	public static final String DB_TEST_URL = "32.18.252.185:9860";
	public static final String DB_TEST_USER = "automationfc";
	public static final String DB_TEST_PASS = "^*^*!!";

	public static final long SHORT_TIMEOUT = 5;
	public static final long LONG_TIMEOUT = 20;
	public static final long RETRY_TEST_FAIL = 3;
	public static final String EXTENT_PATH = "";

}
