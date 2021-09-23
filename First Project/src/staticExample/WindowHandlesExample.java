package staticExample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesExample {

	public void closeBrowser(WebDriver driver, String titleToClose) {
		Set<String> ids = driver.getWindowHandles();// 2

		for (String id : ids) {
			driver.switchTo().window(id);
			String title = driver.getTitle();

			if (title.equals(titleToClose)) {
				driver.close();
			}
		}
	}

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");

		WebElement link = driver.findElement(By.linkText("Open a popup window"));
		link.getText();
		link.click();

		WindowHandlesExample obj = new WindowHandlesExample();
		obj.closeBrowser(driver, "ABC");

	}

}
