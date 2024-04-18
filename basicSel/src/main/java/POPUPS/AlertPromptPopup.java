package POPUPS;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPromptPopup
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(1000);
		alt.sendKeys("no");
		alt.accept();
		
	    WebElement text = driver.findElement(By.xpath("//p[text()='You selected no']"));
		String TextPop=text.getText();
		
		if(TextPop.contains("You selected no"))
		{
			System.out.println("you selected no");
		}
		else
		{
			System.out.println("you selected yes");
		}
	}

}
