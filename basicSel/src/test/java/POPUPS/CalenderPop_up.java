package POPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CalenderPop_up
{
	public static void main(String[] args)
	{
		String mon="March 2024";
		int date=30;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[@class='sc-12foipm-22 cUvQPq fswDownArrow']")).click();
		
		driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[@class='DayPicker-Month']//div[text()='"+mon+"']/../..//p[text()='"+date+"']")).click();
	}

}
