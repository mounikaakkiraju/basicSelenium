package TEST_NG_TY;

import java.io.File;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import KeyActions.TakeScreenShotEx;

public class creeShot 
{
	public static void main(String[] args)
	{

      WebDriver driver = new ChromeDriver();
      
      TakesScreenshot event = (TakesScreenshot)driver;
      File src = event.getScreenshotAs(OutputType.FILE);
      File dsc = new File("./screenshotEX");
      
		
	}

}
