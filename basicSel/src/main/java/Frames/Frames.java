package Frames;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/");
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("mounika");
		driver.findElement(By.id("password")).sendKeys("mounika@123");
		
		
	}

}
