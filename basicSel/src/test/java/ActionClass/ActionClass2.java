package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
         driver.get("https://demo.actitime.com/login.do");
           WebElement name = driver.findElement(By.id("username"));
           WebElement pass = driver.findElement(By.name("pwd"));
          WebElement login = driver.findElement(By.id("loginButton"));
          
          /*Actions act = new Actions(driver);
          act.sendKeys(name , "admin").perform();
          act.sendKeys(pass , "manager").perform();
        act.click(login).perform();*/
        
        Actions act = new Actions(driver);
        act.sendKeys(name ,"admin").sendKeys(pass ,"manager").click(login).perform();
       
		
	}

}
