package Frames;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
//		
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(frame);
		
		WebElement frame2 = driver.findElement(By.xpath("//section[@class='main_form_container']//iframe"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		
	}

	
}
