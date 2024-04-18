package KeyActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessMode
{
	public static void main(String[] args) 
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		
		// (headless) This also will work without using --
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getCurrentUrl());
		
		//This is used to run the script and perform the task without showing the browser is opening
		
		
		
	}

}
