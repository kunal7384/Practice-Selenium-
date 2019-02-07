package com.eventListber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
@Test 

public void test()
{
	driver = new ChromeDriver();
EventFiringWebDriver test = new EventFiringWebDriver(driver);
DemoEventListner handle = new DemoEventListner();
test.register(handle);
test.navigate().to("http://18.218.123.45");
test.findElement(By.xpath("//*[@name='username_or_email']")).sendKeys("sagar1");
test.findElement(By.xpath("//*[@name='login_password']")).sendKeys("password");
test.findElement(By.xpath("//*[@name='commit']")).click();
test.unregister(handle);
test.close();
}
}
