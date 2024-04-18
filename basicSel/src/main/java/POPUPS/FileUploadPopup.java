package POPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup 
{
	public static void main(String[] args)
	{
		 WebDriver driver = new ChromeDriver();
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		WebElement file = driver.findElement(By.id("fileInput"));
	
		file.sendKeys("C:\\Users\\mouni\\Downloads\\Resume@m.pdf");
		
	}

}
