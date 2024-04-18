package KeyActions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneColours 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in");
		
		WebElement phone=driver.findElement(By.id("twotabsearchtextbox"));
		phone.sendKeys("iphone14 mobile");
		phone.click();
		
		driver.findElement(By.xpath("//span[text()='iphone 14 mobile phone']")).click();
		
		//WebElement ele = driver.findElement(By.xpath("(//div[@class='a-section'])[7]//div[contains(@class,'a-section s-color-swatch-container s-quick-view-text-align-start')]"));
		 List<WebElement> ele = driver.findElements(By.xpath("(//div[@class='a-section'])[4]//div[@class='a-section a-spacing-none a-spacing-top-mini s-color-swatch-container-list-view']/div/div//a"));
		for(WebElement col:ele)
		{
			//String c=col.getCssValue("color");
			System.out.println(col.getAttribute("aria-label"));
		}
		
		//String col = ele.getCssValue("color");
		//System.out.println(col);
	}

}
