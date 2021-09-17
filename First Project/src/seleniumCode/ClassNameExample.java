package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://flipkart.com");
		WebElement textbox = driver.findElement(By.xpath(".//input[@class='_2IX_2- VJZDxU']"));

		textbox.sendKeys("acd");
	}

}
