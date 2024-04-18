package General;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks3 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uidai.gov.in/en/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println(allLinks.size());
		
		for(WebElement eachLink:allLinks)
		{
			String link = eachLink.getAttribute("href");
			
			try 
			{
			
			  URL url = new URL(link);
			
			  HttpURLConnection httpconn = (HttpURLConnection)url.openConnection();
			 
			  int statusCode = httpconn.getResponseCode();
			
			  if(statusCode>=400)
			  {
				System.out.println(link+"--->"+statusCode);
			  }
			}
			catch(Exception e)
			{
				
			}
			
			
		}
		
		
	}

}
