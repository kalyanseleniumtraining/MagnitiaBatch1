package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DDExample {
	
	
	
	public WebDriver openBrowser(String browserName)
	{
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("CHROME"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equals("FIREFOX"))
		{
			driver=new FirefoxDriver();
		}
		return driver;
		
	}
	
	public static void selectItemFromDropDown(WebDriver driver,String textToSelect)
	{

		WebElement dropdownBox=driver.findElement(By.id("gh-cat"));
		Select sel=new Select(dropdownBox);
		sel.selectByVisibleText(textToSelect);
	}
	
	
	public static void main(String[] args) throws Exception {
		
		DDExample obj=new DDExample();
		WebDriver driver=obj.openBrowser("chrome");
		driver.get("http://ebay.com");
		
		
		DDExample.selectItemFromDropDown(driver,"Art");
		Thread.sleep(5000);
		DDExample.selectItemFromDropDown(driver,"Baby");
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
