package configreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnviormentType;

public class ConfigReader {
	
	File file ;
	
	FileInputStream fis;
	 
	Properties pro;
	
	
	
	public ConfigReader()
	{
		
	try {
		file = new File(System.getProperty("user.dir")+"/Config/config.properties")	;
		
		fis = new FileInputStream(file);
		
		pro = new Properties();
		
		pro.load(fis);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	public String getApplicationUrl()
	{
		
		String url = pro.getProperty("baseUrl");
		
		 if(url != null) return url;
		 else throw new RuntimeException("url not specified in the Configuration.properties file.");
		
		
	}
	
	public String getUserName()
	{
		
	String uName = pro.getProperty("userName")	;
	return uName;
		
	}
	

	public String getPassWord()
	{
		
	String uPassWord = pro.getProperty("passWord")	;
	return uPassWord;
	
		
	}
	
	public String getStudentName()
	{
		
	String sName = pro.getProperty("studentName")	;
	return sName;
		
	}
	
	public DriverType getBrowser() {
		 String browserName = pro.getProperty("browser");
		 if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
		 else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		 else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
		 else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
		 }
		 
		 public EnviormentType getEnvironment() {
		 String environmentName = pro.getProperty("environment");
		 if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnviormentType.LOCAL;
		 else if(environmentName.equals("remote")) return EnviormentType.REMOTE;
		 else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
		 }
}
