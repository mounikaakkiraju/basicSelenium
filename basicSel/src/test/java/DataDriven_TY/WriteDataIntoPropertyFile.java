package DataDriven_TY;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataIntoPropertyFile
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("./src\\test\\resources\\WriteDataIntoPropertyFile");
		
		Properties pro = new Properties();
		pro.setProperty("browser", "chrome");
		pro.setProperty("URL", "http://localhost:8888");
		pro.setProperty("username", "admin");
		pro.setProperty("password", "admin");
		
		FileOutputStream Fil = new FileOutputStream("./src\\test\\resources\\WriteDataIntoPropertyFile");
		pro.store(Fil, "CommonData");
		
		System.out.println("data is written successfully into the property file..You can open and check");
		
	}

}
