import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenElement {
	
	public static WebDriver driver;
	@Test(priority=1)
	
	public void hiddenDemo()
	{
	driver=new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
	int x =driver.findElement(By.xpath("//*[@id='male']")).getLocation().getX();
	int y =driver.findElement(By.xpath("//*[@id='male']")).getLocation().getY();
	System.out.println(x);
	System.out.println(y);
	
	java.util.List<WebElement> redio = driver.findElements(By.xpath("//*[@id='male']"));
	System.out.println(redio.size());
	
	for(int i=0;i<redio.size();i++)
	{
		int p =redio.get(i).getLocation().getX();
		System.out.println(p);
		
		
		if(p!=0)
		{
		redio.get(i).click();	
			
		}
		
		
	}		
	}

}
