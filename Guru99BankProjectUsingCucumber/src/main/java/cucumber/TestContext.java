package cucumber;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import manager.PageObjectManager;
import manager.WebDriverManager;

public class TestContext {
	public static WebDriver driver;
	private static WebDriverManager wb;
	private static PageObjectManager pom;
	
	public TestContext() throws IOException
	{
		
	 wb = new WebDriverManager();
	
		 pom = new PageObjectManager(wb.getDriver());
		
		
	}
	
	
	public WebDriverManager getwebDriverMAnager()
	{
		return wb;
		
		
		
	}
	
	public PageObjectManager getpageObjectManager()
	{
		return pom;
		
	}
	

}
