package DEMO;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register
{
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/ui/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("mounika");
		driver.findElement(By.id("email")).sendKeys("mounikaakkiraju@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Mounika@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
