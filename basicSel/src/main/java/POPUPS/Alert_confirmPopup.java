package POPUPS;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_confirmPopup 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		String text=alt.getText();
		System.out.println(text);
		
		alt.accept();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		alt.dismiss();
		
		
	}

}
