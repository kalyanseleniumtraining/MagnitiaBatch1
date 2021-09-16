package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.in");

		WebElement amazonSearchBox = driver.findElement(By.id("abcdgjgjhghjgjhgjg"));

		amazonSearchBox.sendKeys("Bags");

		WebElement amazonSearchBtn = driver.findElement(By.id("nav-search-submit-button"));
		amazonSearchBtn.click();

	}

}
