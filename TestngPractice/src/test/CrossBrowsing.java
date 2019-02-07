package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsing {
	/*public static WebDriver driver;
	@Test
	@Parameters("browser")
  public void firefoxTest(String browser) {
		

		
	 if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","F:\\Selenium practice code\\TestngPractice\\ChromeServer\\chromedriver.exe");
			driver = new ChromeDriver();
		
		
		}
	 else if(browser.equalsIgnoreCase("firefox"))
	
{
	System.setProperty("webdriver.gecko.driver","F:\\Selenium practice code\\TestngPractice\\firefoxServer\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();

}
 	

driver.get("http://www.google.co.in");
	}
@Test
public void Cross() throws InterruptedException {
    {
    	Thread.sleep(3000);
	driver.get("http://www.guru99.com");
	
    }
	}*/
	public WebDriver driver;
	 
	  @Parameters("browser")
	 
	 @BeforeMethod
	 
	  // Passing Browser parameter from TestNG xml
	 
	  public void beforeTest(String browser) {
	 
	 if (browser.equalsIgnoreCase("chrome")) { 
	 
		  // Here I am setting up the path for my IEDriver
	 

			System.setProperty("webdriver.chrome.driver","F:\\Selenium practice code\\TestngPractice\\ChromeServer\\chromedriver.exe");
			driver = new ChromeDriver();
	 
		  
	 
	  } 
	 // If the browser is Firefox, then do this
	 
	     else if(browser.equalsIgnoreCase("firefox")) {
	    	 
	 
	    	 System.setProperty("webdriver.gecko.driver","F:\\Selenium practice code\\TestngPractice\\firefoxServer\\geckodriver.exe");
	    		driver = new FirefoxDriver();
	    		driver.manage().window().maximize();
	 
	  // If browser is IE, then do this	  
	 
	  }
	 
	  // Doesn't the browser type, lauch the Website
	 
	  driver.get("http://www.google.co.in"); 
	 
	  }
	 
	  // Once Before method is completed, Test method will start
	 
	  @Test public void login() throws InterruptedException {
	 
		
		WebElement ele =  driver.findElement(By.xpath("//*[@id='lst-ib']"));
		ele.sendKeys("ArtofTesting");
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		 
		  driver.findElement(By.xpath("//*[@href='http://artoftesting.com/selenium-tutorial.html']")).click();
		}  
	 
        @Test 
        public void tp()
        {
        	driver.findElement(By.xpath("//*[@href='automationTesting/selenium-introduction.html']")).click();
        }
		}
	 
	
	
	

