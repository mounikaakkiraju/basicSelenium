package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		
		String email = driver.findElement(By.xpath("//p[text()='Email:Admin@gmail.com']")).getText().substring(6);
		String pass = driver.findElement(By.xpath("//p[text()='Password : Admin@1234']")).getText().substring(9);
		String conPass = driver.findElement(By.xpath("//p[text()='Confirm Password : Admin@1234']")).getText().substring(19);
		
		WebElement frame1 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("confirm-password")).sendKeys(conPass);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		WebElement frame2 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		driver.switchTo().frame(frame2);
		
		String username = driver.findElement(By.xpath("//p[text()='Email:SuperAdmin@gmail.com']")).getText().substring(6);
		driver.findElement(By.id("username")).sendKeys(username);
		
		
	}

}
