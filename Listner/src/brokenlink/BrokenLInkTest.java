package brokenlink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLInkTest {
	
	WebDriver driver;
	@Test
	
	public void run()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
		int x = links.size();
		System.out.println("Size of link" +x);
		WebElement ele = links.get(i);
		String url = ele.getAttribute("href");
		verifyLinkActive(url);
		}
			
	}
		public static void verifyLinkActive(String linkUrl)
		{
		    try 
		    {
		       URL url = new URL(linkUrl);
		       
		       HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
		       
		       httpURLConnect.setConnectTimeout(3000);
		       
		       httpURLConnect.connect();
		       
		       if(httpURLConnect.getResponseCode()==200)
		       {
		           System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
		        }
		      if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
		       {
		           System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
		        }
		    } catch (Exception e) {
		       
		    }
		
			
		}
		
	}


