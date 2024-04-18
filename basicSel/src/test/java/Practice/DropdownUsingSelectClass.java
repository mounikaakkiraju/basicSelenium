package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownUsingSelectClass 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		
         WebElement day = driver.findElement(By.id("day"));
         day.click();
		Select sel = new Select(day);
		sel.selectByVisibleText("5");
		
		WebElement mon = driver.findElement(By.id("month"));
		mon.click();
		Select sel1 = new Select(mon);
		sel1.selectByValue("4");
		
		WebElement year = driver.findElement(By.id("year"));
		year.click();
		Select sel2 = new Select(year);
		sel2.selectByIndex(19);
		
	}

}
