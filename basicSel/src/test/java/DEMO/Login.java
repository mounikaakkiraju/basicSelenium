package DEMO;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'poppins')]")).click();
		driver.findElement(By.id("email")).sendKeys("mounikaakkiraju@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Mounika@123");
		driver.findElement(By.xpath("//button[text()='Login']"));
		
		
	}

}
