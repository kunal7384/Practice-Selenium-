package demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchStudent {

	
	@Test(priority=3)
	public void search_stu() throws InterruptedException
	{
		
		Utility.getdriver().findElement(By.id("search_user")).sendKeys("Kunal Dhote");
		Thread.sleep(2000);
		Utility.getdriver().findElement(By.xpath("//*[text()='Select Student']")).click();
		Thread.sleep(3000);
		Utility.getdriver().findElement(By.xpath("//*[@href='/users/1562' and @class='back-btn'] ")).click();
		
		
	}
}
