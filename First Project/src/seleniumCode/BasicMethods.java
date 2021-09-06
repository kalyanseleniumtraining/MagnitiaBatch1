package seleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");

		String a = "online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

		String b = driver.getTitle();

		if (a.equals(b)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

}
