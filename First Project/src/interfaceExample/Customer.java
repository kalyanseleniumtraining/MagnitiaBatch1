package interfaceExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customer {
	
	
	
	public static void main(String[] args) {
		
		
		Yamaha obj=new ABCYamaha();
		
		WebDriver driver=new FirefoxDriver();
		
		obj.color();
		obj.gears();
		obj.enginePower();
		
		
		
		
		
	}

}
