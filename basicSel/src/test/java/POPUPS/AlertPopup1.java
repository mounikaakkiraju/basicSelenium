package POPUPS;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		String text = alt.getText();
		System.out.println(text);
		alt.accept();
		
		
	}

}
