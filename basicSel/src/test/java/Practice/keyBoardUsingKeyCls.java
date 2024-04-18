package Practice;

import javax.security.auth.kerberos.KeyTab;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyBoardUsingKeyCls 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		/*driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);*/
		
		
		//driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		
	  driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE,Keys.ENTER);
		
	  
	}

}
