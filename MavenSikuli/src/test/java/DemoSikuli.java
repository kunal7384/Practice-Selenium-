


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Screen;


public class DemoSikuli {
	
	WebDriver driver;
	
	@Test
	public void demo() throws FindFailed
	{
		org.sikuli.script.Screen s = new org.sikuli.script.Screen();
		
		Pattern p_username = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\ppad\\username.PNG");
		
		Pattern p_login = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\ppad\\login.PNG");
		
		
		driver = new ChromeDriver();
		driver.get("http://practice-pad.com/");
		s.type(p_username,"don");
		driver.findElement(By.id("login_password")).sendKeys("don123");
		
		s.click(p_login);
	
	}
	
	

}
