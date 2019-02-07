package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateStudentPage {
	public static WebDriver driver;
	
	@FindBy(id="Layer_1")
	WebElement click_stu;
	
	@FindBy(name="commit")
	WebElement stu_submmit;
	
	@FindBy(xpath="//span[contains(text(),\"Username can't be blank\")]")
	WebElement error;
	
	@FindBy(xpath="//*[text()='×']")
	WebElement close;
	
	public CreateStudentPage(WebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
		
		
	}
	
	public void validateStudent() throws InterruptedException
	{
		click_stu.click();
		Thread.sleep(1000);
		stu_submmit.click();
		String errorm = error.getText();
		System.out.println("=="+errorm);
		close.click();
	
	}
		
		
		
	

}
