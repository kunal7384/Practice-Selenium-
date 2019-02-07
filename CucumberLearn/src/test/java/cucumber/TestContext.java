package cucumber;

import manager.PageObjectManager;
import manager.WebDriverManage;

public class TestContext {
	
	/*PageObjectManager  pom ; 
	
	WebDriverManage wm ; 
	
	
	
	
	public TestContext()
	{
		
	wm = new WebDriverManage();
	pom = new PageObjectManager(wm.getDriver());
		
	}
	
	
	public WebDriverManage getWebDriverManager()
	{
		return wm;
	
	}
	
	
	public PageObjectManager getPageObjectManager()
	{
		return pom;
		
		
		
	}*/
	
	private WebDriverManage wm;
	 private PageObjectManager pom;;
	 
	 public TestContext(){
	 wm = new WebDriverManage();
	 pom = new PageObjectManager(wm.getDriver());
	 }
	 
	 public WebDriverManage getWebDriverManager() {
	 return wm;
	 }
	 
	 public PageObjectManager getPageObjectManager() {
	 return pom;
	 }

}
