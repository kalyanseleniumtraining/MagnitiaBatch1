package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartExample2 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://flipkart.com");
		
		driver.findElement(By.xpath(".//*[@class='_2IX_2- VJZDxU']")).sendKeys("9866433348");
		driver.findElement(By.xpath(".//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("amrutha@123");
		driver.findElement(By.xpath("(.//*[@type='submit'])[2]")).click();
		
	}

}
