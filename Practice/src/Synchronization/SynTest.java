package Synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SynTest {
	
	WebDriver driver;
	@Test
	public void run()
	{
	driver = new ChromeDriver();
	driver.get("http://18.218.123.45/");
Utility.elementIsPresent(driver, "//*[@name='username_or_email']", 20).sendKeys("don");
Utility.elementIsPresent(driver, "//*[@name='login_password']", 20).sendKeys("don123");
Utility.elementIsPresent(driver, "//*[@name='commit']", 20).click();

		
	}

}
