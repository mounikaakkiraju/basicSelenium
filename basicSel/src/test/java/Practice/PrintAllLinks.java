package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int i=1;
		for(WebElement all:allLinks)
		{
			System.out.println(all.getText());
			i++;
		}
		System.out.println("total :"+i);
		
	}

}
