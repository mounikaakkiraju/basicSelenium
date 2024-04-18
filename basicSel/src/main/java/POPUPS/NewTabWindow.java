package POPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtilites.WebDriverUtility;

public class NewTabWindow 
{
	public static void main(String[] args) 
	{
        WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/browser/newTab?sublist=1");
		
		
		//Using Generic Utility
		
		WebDriverUtility mLib=new WebDriverUtility();
		driver.findElement(By.xpath("//button[text()='Open window in new Tab']")).click();
		mLib.switchToWindow(driver, "SignUpPage");
		driver.findElement(By.id("email")).sendKeys("mounika@gmail.com");
		
		
		
		
	}

}
