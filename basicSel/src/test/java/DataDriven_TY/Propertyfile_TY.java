package DataDriven_TY;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Propertyfile_TY 
{
	public static WebDriver driver;
	
	
	
	public static void main(String[] args) throws IOException
	{
		
		
		FileInputStream file = new FileInputStream("./src\\test\\resources\\PropertyFile_TY");
		Properties pro = new Properties();
		pro.load(file);
		
	      String Browser = pro.getProperty("browser");
	     String URL = pro.getProperty("url");
	     String UserName = pro.getProperty("username");
	     String Pass = pro.getProperty("password");
	     
	     if(Browser.equalsIgnoreCase("chrome"))
	     {
	    	driver= new ChromeDriver();
	     }
	     else if(Browser.equalsIgnoreCase("firefowx"))
	     {
	    	 driver=new FirefoxDriver();
	     }
	     else
	     {
	    	 System.out.println("invalid browsers");
	     }
	     
	     driver.get(URL);
	     driver.findElement(By.name("user_name")).sendKeys(UserName);
	     driver.findElement(By.name("user_password")).sendKeys(Pass);
	     driver.findElement(By.id("submitButton")).click();
	     
	     
	     
		
		
		
	}

}
