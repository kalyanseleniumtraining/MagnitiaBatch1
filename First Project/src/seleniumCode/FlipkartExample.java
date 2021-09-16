package seleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.flipkart.com/search?q=laptops&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

		// findelements

		List<WebElement> laptopNames = driver.findElements(By.className("_4rR01T"));

		for (int x = 0; x < laptopNames.size(); x++) {

			WebElement laptopname = laptopNames.get(x);

			System.out.println(laptopname.getText());
		}

	}

}
