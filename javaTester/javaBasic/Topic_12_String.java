package javaBasic;

public class Topic_12_String {

	public static void main(String[] args) {
		String s1 = "Automation Testing Vietnam";
		String s2 = "Automation Testing Vietnam";

		Boolean compare = (s1 == s2);
		System.out.println(compare);
		System.out.println("Độ dài = " + s1.length());
		System.out.println("Lấy ra 1 kí tự = " + s1.charAt(0));
		System.out.println("Nối 2 chuỗi = " + s1.concat(s2));
		System.out.println("Nối 2 chuỗi = " + s1 + s2);

		// Tuyệt đối
		System.out.println("Kiểm tra 2 chuỗi có bằng nhau tuyệt đối: " + s1.equals(s2));
		System.out.println("Kiểm tra 2 chuỗi có bằng nhau tuyệt đối: " + s1.equals("Java"));

		// Multi browser
		System.out.println("Kiểm tra 2 chuỗi có bằng nhau tương đối: " + s1.equalsIgnoreCase("JAVA"));

		// starstwith/endswith/ contains
		System.out.println("Có bắt đầu bằng 1 kí tự hay 1 chuỗi ký tự = " + s1.startsWith("Ja"));
		System.out.println("Có kết thúc bằng 1 kí tự hay 1 chuỗi ký tự = " + s1.endsWith("va"));
		System.out.println("Có chứa 1 kí tự hay 1 chuỗi ký tự = " + s1.contains("av"));

		// indexOf
		System.out.println("Vị trí của 1 ký tự/ chuỗi ký tự = " + s1.indexOf("Auto"));
		System.out.println("Vị trí của 1 ký tự/ chuỗi ký tự = " + s1.indexOf("to"));

		// substring
		System.out.println("Tách 1 chuỗi ký tự = " + s1.substring(8));
		System.out.println("Tách 1 chuỗi ký tự = " + s1.substring(11, 18));

		// split
		String result = "Viewing 48 of 132 results";
		String results[] = result.split(" ");

		for (String string : results) {
			System.out.println(string);
		}

		System.out.println(results[1]);

		// Replace
		String productPrice = "$100.00";
		productPrice = productPrice.replace("$", "");
		System.out.println(productPrice);

		// Dùng để sort data (Asc/Desc)
		float productPriceF = Float.parseFloat(productPrice);
		System.out.println(productPriceF);

		productPrice = String.valueOf(productPriceF);

		// Dynamic locator
		// Đại diện cho 1 chuỗi %s
		// %b %t %d
		String dynamicButtonXpath = "//button[@id='%s']";
		System.out.println("Click to Login button = " + dynamicButtonXpath.format(dynamicButtonXpath, "login"));
		System.out.println("Click to Login button = " + dynamicButtonXpath.format(dynamicButtonXpath, "search"));
		System.out.println("Click to Login button = " + dynamicButtonXpath.format(dynamicButtonXpath, "register"));
	}

}
