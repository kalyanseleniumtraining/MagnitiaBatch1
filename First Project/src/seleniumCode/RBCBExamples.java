package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RBCBExamples {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");

		WebElement ele = driver.findElement(By.id("one"));

		if (ele.isSelected() == true) {
			System.out.println("One is selected by default");
		} else {
			System.out.println("one is not selected");
		}

		WebElement ele1 = driver.findElement(By.id("two"));
		ele1.click();

//		WebElement checkbox = driver.findElement(By.name("permission"));
//		//Thread.sleep(10000);
//
//		boolean state = checkbox.isSelected();
//
//		if (state == false) {
//			checkbox.click();
//		} else {
//			System.out.println("Checkbox is already selected not performing any action");
//		}

	}
}
