import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoFrame {
	
	
	public static WebDriver driver;
	
	@Test
	
	public void demoframe() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		int total=driver.findElements(By.tagName("iFrame")).size();
		System.out.println("Total Size of Frame is==" +total);
		driver.switchTo().frame("IF1");
	
		 System.out.println("********We are switched to the iframe*******");
		WebElement ele=	driver.findElement(By.xpath("//*[contains(text(),'Always')]"));
			 System.out.println(ele.getText());
			//Clicking the element in line with Advertisement
		    System.out.println("*********We are done***************");
		    driver.switchTo().defaultContent();
		 WebElement elem=   driver.findElement(By.xpath("//*[text()='Sample Iframe page']"));
		 System.out.println(elem.getText());
	//driver.switchTo().frame(1);
 WebElement my= driver.findElement(By.xpath("//iframe[@name='iframe2']"));
	
		 
		 driver.switchTo().frame(my);
		 Thread.sleep(1100);
		 
		 driver.findElement(By.xpath("//*[text()='ToolsQA']")).click();
	
	
	
	
	
	}
	
	
}
