package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_Login
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		
		FileInputStream file = new FileInputStream("./New_propertyFile.properties.txt");
		
		Properties pro = new Properties();
		pro.load(file);
		
		String URL=pro.getProperty("url");
		String USER=pro.getProperty("username");
		String PASS=pro.getProperty("password");
		
		driver.get(URL);
		
		LoginPage login = new LoginPage(driver);
		
		//using getter methods
		/*login.getUserText().sendKeys(USER);
		login.getPass().sendKeys(PASS);
		login.getLogin().click();*/
		
		//using Business class
		login.LoginIntoApp(USER, PASS);
		
		
	}

}
