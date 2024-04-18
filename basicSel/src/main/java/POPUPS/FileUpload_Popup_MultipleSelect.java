package POPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Popup_MultipleSelect 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload/multiple?sublist=3");
		WebElement choose = driver.findElement(By.id("fileInput"));
		choose.sendKeys("C:\\Users\\mouni\\Downloads\\Resume@m.pdf");
		choose.sendKeys("C:\\Users\\mouni\\Downloads\\MONI.docx");
		
		WebElement files = driver.findElement(By.className("list-decimal"));
		String text=files.getText();
		System.out.println(text);
		
		
	}

}
