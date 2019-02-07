package manager;

import java.io.IOException;

import configreader.ReadConfigFile;

public class FileReaderManager {
	
	private static FileReaderManager frm = new FileReaderManager();
	private static ReadConfigFile cf;
	
	private FileReaderManager()
	{
		
		
	}
    public static FileReaderManager getInstance()
    {
		return frm;
    	
    	
    }
    
    
    public ReadConfigFile getconfig() throws IOException
    {
    	
    return(cf==null)	? cf = new ReadConfigFile() : cf;
    	
    }
}
