package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame2
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(frame);
		
		WebElement email = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']"));
		String emailText = email.getText();
		
		WebElement frame2 = driver.findElement(By.xpath("//section[@class='main_form_container']//iframe"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailText);
		
		driver.switchTo().parentFrame();
		
		WebElement pass = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']"));
		String passText=pass.getText();
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passText);
		
	}

}
