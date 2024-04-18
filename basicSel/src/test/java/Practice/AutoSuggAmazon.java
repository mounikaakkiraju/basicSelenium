package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggAmazon
{
	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nike");
	    Thread.sleep(1000);
	    List<WebElement> all = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));
		
		for(WebElement a:all)
		{
			if(a.getText().contains("nike air jordan"))
			{
				a.click();
				break;
				
			}else 
			{	
				System.out.println("not present");
			}
				
			
		}
	    
		
	}

}
