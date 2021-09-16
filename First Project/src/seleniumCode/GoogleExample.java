package seleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleExample {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (int i = 0; i < links.size(); i++) {
			WebElement link = links.get(i);
			System.out.println(link.getText());
		}

	}

}
