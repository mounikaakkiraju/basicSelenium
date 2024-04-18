package DataDriven_TY;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyFile_RMGserver
{
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file= new FileInputStream("./src\\test\\resources\\PropertyFile_TY");
		
		Properties pro=new Properties();
		pro.load(file);
		
		     String Browser = pro.getProperty("browser");
		     String URL = pro.getProperty("RMG_URL");
		     String UserName = pro.getProperty("Patient_User");
		     String Pass = pro.getProperty("Patient_Pass");
		     
		     if(Browser.equalsIgnoreCase("chrome"))
		     {
		    	driver= new ChromeDriver();
		     }
		     else if(Browser.equalsIgnoreCase("firefox"))
		     {
		    	 driver=new FirefoxDriver();
		     }
		     else
		     {
		    	 System.out.println("invalid browsers");
		     }
		     
		     driver.get(URL);
		    driver.findElement(By.name("username")).sendKeys(UserName);
		    driver.findElement(By.name("password")).sendKeys(Pass);
		    driver.findElement(By.name("submit")).click();
		     
		     
		
		
	}

}
