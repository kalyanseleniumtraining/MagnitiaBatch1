package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentification {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");

		// enter mobiles in the search box

		WebElement searchBox = driver.findElement(By.id("gh-ac"));
		searchBox.sendKeys("Mobiles");

		WebElement button = driver.findElement(By.id("gh-btn"));
		button.click();

	}

}
