package syn.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	@Test
	public void run()
	{
		
	driver = new ChromeDriver();
	driver.get("http://18.218.123.45/");
	 DemoSyn.webElementisPresent(driver,"//*[@id='username_or_email']", 20).sendKeys("sagar1");
	 DemoSyn.webElementisPresent(driver, "//*[@id='login_password']", 20).sendKeys("password");
	 DemoSyn.webElementisPresent(driver, "//*[@value='Login']", 20).click();
	}

}
