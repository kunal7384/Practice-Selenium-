package manager;

import configreader.ConfigReader;

public class FileReaderManager {
	
	
	private static final FileReaderManager frm = new FileReaderManager();
	
	ConfigReader con ;
	
	
	private FileReaderManager()
	{
		
		
	}

	public static FileReaderManager getInstance()
	{
		return frm;
		
	}
	
	
	public ConfigReader getConfigReader()
	{
		
	return (con==null)	? con = new ConfigReader() :con;
		
	}
}
