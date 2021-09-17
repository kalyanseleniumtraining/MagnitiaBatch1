package seleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBoxExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");

		WebElement ele = driver.findElement(By.id("gh-cat"));

		Select sel = new Select(ele);

		WebElement defaultElement = sel.getFirstSelectedOption();

		String defaultValue = defaultElement.getText();

		if (defaultValue.equals("All Categories")) {
			System.out.println("Default value matched");
		} else {
			System.out.println("Default value not matched");
		}

//		List<WebElement> items = sel.getOptions();
//		for (int i = 0; i < items.size(); i++) {
//			WebElement item = items.get(i);
//
//			System.out.println(item.getText());
//
//		}

		// sel.selectByIndex(2);

		// sel.selectByVisibleText("CRAFTS");

		// sel.selectByValue("15032");

	}

}
