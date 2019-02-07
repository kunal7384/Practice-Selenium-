package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchStudentPage {
	
	public static WebDriver driver;

	
   @FindBy(xpath="//input[@id='search_user']")
	
	WebElement txt_searchStudent;
	
	
    @FindBy(xpath="//a[@class='line-btn act']")
	
	WebElement btn_clickOnSelectStudent;
    

    @FindBy(xpath="//*[@id='teachers']")
	
   	WebElement drp_allteachetList;
    
    
    public SearchStudentPage(WebDriver driver)
	{
		
	this.driver = driver;
	
	PageFactory.initElements(driver,this);
		
	}
    
    
    public void setSearchStudent(String studentName)
	{
		System.out.println("33");
		txt_searchStudent.sendKeys(studentName);
			
	}
	
	public void clickingOnStudent()
	{
		
		btn_clickOnSelectStudent.click();
	
	}
	
	public void allTeacher()
	{
		
	Select select = new Select(drp_allteachetList)	;
	
	   List<WebElement> allTeacher =  select.getOptions();
	   
	   System.out.println(allTeacher.size());
	   
	   for(int i=0;i<allTeacher.size();i++)
	   {
		   
		 String nameOfTeachers = allTeacher.get(i) .getText() ;
		 
		 System.out.println(nameOfTeachers);
		   
	   }
		
		
	}
	
}
