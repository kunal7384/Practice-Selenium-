package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadVideoPage {
	public static WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Video')]")
	WebElement video;
	
	@FindBy(id="video_video_url")
	WebElement upoload_video;
	
	
	public UploadVideoPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void uploadVideo() throws FindFailed, InterruptedException
	{
		Thread.sleep(2000);
	video.click();	
	upoload_video.click();	
	Screen s = new Screen();
	Pattern desk_img = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\guru 99 pro\\desk.PNG");
	Pattern video_img = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\guru 99 pro\\video.PNG");
	Pattern open_img = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\guru 99 pro\\open.PNG");
	
	s.click(desk_img);
	s.type(video_img,"Aug 31 2018 4_34 PM.webm");
	s.click(open_img);
		
	}

}
