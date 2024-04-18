package POPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload_Popup_CustomButton 
{
	public static void main(String[] args) throws InterruptedException
	{

		 WebDriver driver = new ChromeDriver();
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
		WebElement upload = driver.findElement(By.xpath("//section[@class='flex items-center']"));
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(upload).perform();
		
		act.sendKeys("C:\\Users\\mouni\\Downloads\\Resume@m.pdf").perform();
		
		
	}

}
