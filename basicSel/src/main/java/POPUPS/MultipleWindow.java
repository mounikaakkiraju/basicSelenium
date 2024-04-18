package POPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtilites.WebDriverUtility;

public class MultipleWindow
{
	public static void main(String[] args) throws InterruptedException
	{
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
			
			driver.findElement(By.xpath("//button[text()='Click to open multiple popup windows']")).click();
			
			WebDriverUtility wu=new WebDriverUtility();
			
			
			
			Thread.sleep(2000);
			wu.switchToWindow(driver, "SignUpPage");
			driver.findElement(By.id("email")).sendKeys("abc1@");
			driver.close();
			
			Thread.sleep(2000);
			
			wu.switchToWindow(driver, "SignUp");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc2");
			driver.close();
			
			wu.switchToWindow(driver, "Login");
			driver.findElement(By.id("username")).sendKeys("abc3");
			
			
	}

}
