package POPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPop_up2 
{
	
		public static void main(String[] args)
		{
			String mon="March 2025";
			int date=31;
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.goibibo.com/");
			driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
			driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
			driver.findElement(By.xpath("//span[@class='sc-12foipm-22 cUvQPq fswDownArrow']")).click();
			
		for(; ;)
		 {	
			try 
			{
			 driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[@class='DayPicker-Month']//div[text()='"+mon+"']/../..//p[text()='"+date+"']")).click();
			 break;
			}
			
			catch(Exception e)
			{
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
		 }	
		}

	


}
