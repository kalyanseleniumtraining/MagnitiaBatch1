package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/n/all-categories#health-and-beauty");
		driver.manage().window().maximize();

//		WebElement myebay = driver.findElement(By.linkText("My eBay"));
		Actions act = new Actions(driver);
		
		
		WebElement ele1=driver.findElement(By.id("gh-btn"));
		
		WebElement ele2=driver.findElement(By.id("gf-norton"));
		
		
		
		act.dragAndDrop(ele1, ele2).perform();
		
		
		
//		act.moveToElement(myebay).perform();
//
//		Thread.sleep(5000);
//		WebElement messageslink = driver.findElement(By.xpath(".//*[@id='gh-ul-nav']/li[10]/a"));
//
//		act.click(messageslink).perform();

		// act.doubleClick(messageslink)act.perform();
		//act.contextClick(messageslink).perform();

		//act.contextClick().perform();

	}

}
