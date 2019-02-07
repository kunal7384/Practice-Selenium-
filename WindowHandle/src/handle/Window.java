package handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window {
	
	public static WebDriver driver;
	
	@Test
	public void test()
	{
		driver= new ChromeDriver();
		driver.get("http://www.eyerne.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mis@narola.email");
		driver.findElement(By.xpath("//*[@id='password_login']")).sendKeys("password");
	List<WebElement> ele= driver.findElements(By.xpath("//*[@type='submit']"));
	/*/int x = ele.size();
	
	
	System.out.println(x);
int a=	 driver.findElement(By.xpath("//*[@type='submit']")).getLocation().getX();
int b=	 driver.findElement(By.xpath("//*[@type='submit']")).getLocation().getY();
System.out.println(a );
System.out.println(b );
for(int i=0;i<ele.size();i++)
{
System.out.println(i);
int p = ele.get(i).getLocation().getX();
if(!(p==0)) {
	
	ele.get(i).click();
}


}*/
	
	int x = ele.size();
	 driver.findElements(By.xpath("//*[@type='submit']")).get(x-2).click();
	 
	 
	 WebElement ele2  = driver.findElement(By.xpath("//*[@class='c-property-card__address']"));
ele2.click();

		
	}

}
