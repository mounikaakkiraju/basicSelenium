package POPUPS;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles2
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.findElement(By.linkText("Open in new window")).click();
		
		Set<String> allWin = driver.getWindowHandles();
		for(String win:allWin)
		{
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println();
			
			if(title.contains("SignUpPage"))
			{
				driver.switchTo().window(title);
				break;
			}
		}
		
		driver.findElement(By.id("email")).sendKeys("mounika@gmail.com");
		
		
	}

}
