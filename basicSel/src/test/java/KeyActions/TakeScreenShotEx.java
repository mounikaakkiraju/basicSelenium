package KeyActions;

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotEx
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		TakesScreenshot event=(TakesScreenshot)driver;
		File scr = event.getScreenshotAs(OutputType.FILE);
		File dsc=new File("./screenshot.png");
		//FileUtils.copyFile(src,dsc);
		
		
	}

}
