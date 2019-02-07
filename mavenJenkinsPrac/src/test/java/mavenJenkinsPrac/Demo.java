package mavenJenkinsPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	@Test
	
	
	public void scrollSelenium() throws InterruptedException
	{
	driver=new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor)driver;
driver.get("http://demo.guru99.com/test/guru99home/");
	// js.executeScript("window.scrollBy(0,1500)");*/
	
	 WebElement Element = driver.findElement(By.linkText("Linux"));
	 
	 js.executeScript("arguments[0].scrollIntoView();", Element);
	 
	 System.out.println("Sucessfully Excuted and RUN ");
	 Thread.sleep(1000);
	}
@Test(priority=2)
	
	
	public void great_palce_to_work() throws InterruptedException
	{
    driver.get("http://18.218.190.110");
    driver.findElement(By.name("user[email]")).sendKeys("kd@narola.email");
    driver.findElement(By.name("user[password]")).sendKeys("password");
  
   
   String ExceptedTitle="GreatPlaceToWork";
    driver.findElement(By.name("commit")).click();
    String title= driver.getTitle();
    System.out.println(title);
    Assert.assertEquals(title, ExceptedTitle);
    driver.findElement(By.xpath("//*[@class='avater']")).click();
    driver.findElement(By.xpath("//*[@href='/admins/sign_out']")).click();
    
  Thread.sleep(1000);  

}
@Test(priority=3)


public void invalid()
{
driver.get("http://18.218.190.110");
driver.findElement(By.name("user[email]")).sendKeys("kd@narola.email");
driver.findElement(By.name("user[password]")).sendKeys("passwrd");
driver.findElement(By.name("commit")).click();
WebElement ele = driver.findElement(By.xpath("//*[text()='Invalid username or password.']"));
String error = ele.getText();
System.out.println(error);
String excep = "Invalid username or password.";
//Assert.assertEquals(driver.findElement(By.xpath("//*[text()='Invalid username or password.']")).getText(), "Invalid username or password.");
Assert.assertEquals(error, excep);
}
}