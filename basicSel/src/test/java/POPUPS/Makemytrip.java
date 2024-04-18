package POPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.id("departure")).click();
		driver.findElement(By.xpath("//span[text()='Buses']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
	}

}
