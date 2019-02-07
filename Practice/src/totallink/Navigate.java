package totallink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigate {
	WebDriver driver;
	@Test
public void run()
{
/*driver =new ChromeDriver();
driver.get("https://www.google.com");
List<WebElement> link = driver.findElements(By.tagName("a"));

int linknaviagate = link.size();
System.out.println("Totao Links Present is "+linknaviagate);
  
 String[] links = new String[linknaviagate];
 for(int i =0;i<link.size();i++)
 { 
	// THis is for navigate link
	 links[i]= link.get(i).getAttribute("href");
	 
	 
 }	
 
 for(int i =0;i<link.size();i++)
 {
	 driver.navigate().to(links[i]);
	 
	 
 }*/
driver = new ChromeDriver();
driver.get("https://www.google.com");
List<WebElement> link = driver.findElements(By.tagName("a"));


for(int i=0;i<link.size();i++)
{

	WebElement ele =link.get(i);
	String aa =  ele.getAttribute("href");
	System.out.println(aa);
}

} 
 	
}
