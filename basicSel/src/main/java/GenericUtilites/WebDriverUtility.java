package GenericUtilites;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WebDriverUtility 
{
	public void switchToWindow(WebDriver driver,String URL)
	{
		Set<String> allWin = driver.getWindowHandles();
		
		for(String windows:allWin)
		{
			driver.switchTo().window(windows);
			String title=driver.getTitle();
			
			if(title.contains(URL))
			{
				driver.switchTo().window(URL);
				break;
				
			}
			
		}
	}

}
