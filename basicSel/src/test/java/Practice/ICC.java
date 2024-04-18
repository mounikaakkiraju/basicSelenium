package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICC
{
	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		
		driver.findElement(By.xpath("//div[.='Accept']")).click();
		
		WebElement data = driver.findElement(By.xpath("//span[.='IND']/ancestor::tbody"));
		System.out.println(data.getText());
	}

}
