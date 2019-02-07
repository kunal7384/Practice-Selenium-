package com.kunal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.testng.Assert;
 
import org.testng.annotations.Test;
 
 
 

 
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
 
 
 
public class DemoExe {
 
 
 
 
 
     @Test
 
     public void verifySeleniumBlog(){
 
 
 
           // Create object of extent report and specify the Class name in get method
 
           // in my case I have used AdvanceReporting.class
 
          ExtentReports ext= new ExtentReports("C:\\Users\\dkunal\\Desktop\\adv.html");
 
 
 
           // Call init method and specify the location where you want to save this report
 
           // second parameter is set to true it means it will overwrite report with new one
 
          ExtentTest test = ext.startTest("verifyTitle");
 
 
 
           // Start Test
 
         
 
 
 
 
 
           // Start browser
 
           WebDriver driver=new ChromeDriver();
 
           driver.manage().window().maximize();
 
           test.log(LogStatus.INFO, "Browser started");
 
 
 
           // Open application
 
           driver.get("http://learn-automation.com");
 
           test.log(LogStatus.INFO, "Navigated to www.learn-automation.com");
 
 
 
           // get title
 
           String title=driver.getTitle();
 
           test.log(LogStatus.INFO, "Get the current title");
 
 
 
           // Verify title
 
            Assert.assertTrue(title.contains("Selenium"));
 
            test.log(LogStatus.PASS, "Title verified");
 
 
 
            // In case you want to attach screenshot then use below method
 
            // I am taking random image but you have to take screenshot at run time and specify the path
 
         //   test.attachScreenshot("C:\\Mukesh\\image1.jpg");
 
 
 
            // Close application
 
          
            test.log(LogStatus.INFO, "Browser closed");
 
 
 
            // close report
 
            ext.endTest(test);
 
 
 
     }
 
 
 
}