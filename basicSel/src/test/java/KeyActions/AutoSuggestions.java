package KeyActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shirts");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']"));
		String te = ele.getText();
		System.out.println(te);
		
		if(te.contains("shirts for women"))
		{
		  ele.click();
		}
		
	}
	

}
