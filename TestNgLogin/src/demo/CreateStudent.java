package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateStudent  {

	@Test(priority=4)

	public void create_student() throws InterruptedException
	{
		
		Utility.getdriver().findElement(By.xpath("//*[text()='New Student']")).click();
		Thread.sleep(1000);
		Utility.getdriver().findElement(By.id("user_fname")).sendKeys("ddddd");
		Utility.getdriver().findElement(By.id("user_lname")).sendKeys("aassd");
		WebElement close = Utility.getdriver().findElement(By.xpath("//*[text()='×']"));
		close.click();
		
		
	}

}
