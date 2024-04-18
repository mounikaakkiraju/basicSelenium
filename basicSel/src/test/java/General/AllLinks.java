package General;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
	      List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for( WebElement all:links)
		{
			System.out.println(all.getText());
		}
		
	}

}
