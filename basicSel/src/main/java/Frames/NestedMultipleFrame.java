package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedMultipleFrame 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		
       WebElement mainFrame = driver.findElement(By.xpath("//section[@class='main_form_container']"));
		driver.switchTo().frame(mainFrame);
		
		WebElement child = driver.findElement(By.xpath("//section[@class='main_form_container']//iframe"));
		driver.switchTo().frame(child);
		
		WebElement SubChild = driver.findElement(By.xpath("//h2[text()='Login']"));
		driver.switchTo().frame(0);
		
		
		
	}

}
