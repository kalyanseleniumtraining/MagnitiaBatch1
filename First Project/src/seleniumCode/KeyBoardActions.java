package seleniumCode;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");
		driver.manage().window().maximize();

		Thread.sleep(10000);

		Actions act = new Actions(driver);

		act.keyDown(Keys.CONTROL).sendKeys("s").keyUp(Keys.CONTROL).perform();

	}

}
