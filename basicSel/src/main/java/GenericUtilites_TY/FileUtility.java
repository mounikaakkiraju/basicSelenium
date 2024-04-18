package GenericUtilites_TY;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility 
{
	public String readDatafromProperty(String key) throws IOException
	{
		FileInputStream file = new FileInputStream(" ");
		Properties pro= new Properties();
		pro.load(file);
		String value=pro.getProperty(key);
		return value;
	}

}
