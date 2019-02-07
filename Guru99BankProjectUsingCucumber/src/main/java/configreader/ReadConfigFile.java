package configreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnviormentType;

public class ReadConfigFile {
	
	File file;
	FileInputStream fis;
	Properties pro;
	
	
	
	
	public ReadConfigFile() throws IOException
	{
		file = new File("F:\\Selenium practice code\\Guru99BankProjectUsingCucumber\\config\\read.properties");
		fis = new FileInputStream(file);
		pro = new Properties();
		pro.load(fis);
		
	}
	
    public String geturl()
    {
    	
    String url1 = pro.getProperty("url");	
    if(url1 !=null)	return url1;
    else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    	
    }
    
    public String getusername()
    {
    	String uname =pro.getProperty("username");
    	
    	if(uname!=null) return uname;
    	
    	else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    	
    	
    }
    
    public String getpassword()
    {
    	String upass =pro.getProperty("pass");
    	
    	if(upass!=null) return upass;
    	
    	else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    	
    	
    }
    
    
    public DriverType getbrowser()
    {
    	String browserName = pro.getProperty("browser");
		if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
		else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
    }
    
    
    public EnviormentType getenviorment()
    {
    	String environmentName = pro.getProperty("environment");
		if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnviormentType.LOCAL;
		else if(environmentName.equals("remote")) return EnviormentType.REMOTE;
		else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
    	
    	
    }
    
}
