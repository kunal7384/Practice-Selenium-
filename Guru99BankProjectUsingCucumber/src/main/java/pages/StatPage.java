package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Stats')]")
	WebElement stats;
	
	@FindBy(id="tab1")
	WebElement text;
	
	@FindBy(id="progress-tab")
	WebElement progress;
	
	public StatPage(WebDriver driver)
	{
		
		        this.driver= driver;
				PageFactory.initElements(driver, this);
		
		
	}

	public void getstats()
	{
		stats.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String textofstat = text.getText();
		System.out.println("Text of Stat " + textofstat);
		
		String progressBar = progress.getText();
		System.out.println("Progress Bar Of Instument Guitar is"+progressBar);
		
		
	}
	
}
