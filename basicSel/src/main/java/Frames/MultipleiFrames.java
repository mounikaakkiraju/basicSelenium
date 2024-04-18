package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleiFrames 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		
		WebElement frame1 = driver.findElement(By.xpath("(//div[@class='w-1/2']/iframe)[1]"));
		driver.switchTo().frame(frame1);
		
	     driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
	     driver.findElement(By.id("password")).sendKeys("Admin@1234");
	     driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
	     
		driver.switchTo().defaultContent();//used to come out of the frame
		
		WebElement frame2 = driver.findElement(By.xpath("(//div[@class='w-1/2']/iframe)[2]"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.id("username")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
		
		
		
	}

}
