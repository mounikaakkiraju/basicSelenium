package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		 WebElement data = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		
	    Actions act = new Actions(driver);
	    act.moveToElement(data);
	    act.click(data).perform();
		
		//thank you
	}

}
