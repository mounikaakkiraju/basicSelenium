package Practice;

import org.apache.commons.compress.archivers.sevenz.CLI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownUsingXapth 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("(//option[@value='1'])[1]")).click();
		
		
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("(//option[@value='2'])[2]")).click();
		
		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//option[@value='2012']")).click();
		
	}

}
