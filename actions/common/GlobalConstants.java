package common;

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
	public static final String UPLOAD_FILE_FOLDER = PROJECT_PATH + File.separator + "uploadFiles";

	// trỏ về thư mục mặc định của user
	// Window: Downloads
	public static final String DOWNLOAD_FILE = PROJECT_PATH + File.separator + "downloadFiles";
	public static final String BROWSER_LOG = PROJECT_PATH + File.separator + "browserLogs";
	public static final String DRAG_DROP_HTML5 = PROJECT_PATH + File.separator + "dragDropHTML5";
	public static final String AUTO_IT_SCRIPT = PROJECT_PATH + File.separator + "autoIT";

	// Popup lên mới upload
	// Headless browser
	// Jenkins service (File cài đặt) - Headless
	// Jenkins (.war) - Bật browser

}
