package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenFromProp 
{
	public static void main(String[] args) throws Throwable 
	{
		     FileInputStream file = new FileInputStream(".//src/main/resources/actiTime.properties.txt");
		     
		   Properties pro = new Properties();
		   pro.load(file);
		  String ur = pro.getProperty("url");
		  String user = pro.getProperty("username");
		  String pass = pro.getProperty("password");
		   
		   
		   
		   
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get(ur);
		  driver.findElement(By.id("username")).sendKeys(user);
		 driver.findElement(By.name("pwd")).sendKeys(pass);
		 driver.findElement(By.id("loginButton")).click();
		     
		
	}

}
