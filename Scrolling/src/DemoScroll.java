import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Argument;

public class DemoScroll {
	
	public static WebDriver driver;
	@Test
	
		
		public void scrollSelenium()
		{
		driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
	driver.get("http://demo.guru99.com/test/guru99home/");
		// js.executeScript("window.scrollBy(0,1500)");*/
		
		 WebElement Element = driver.findElement(By.linkText("Linux"));
		 
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		}
	

}
