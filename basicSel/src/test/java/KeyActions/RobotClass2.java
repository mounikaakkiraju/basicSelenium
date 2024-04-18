package KeyActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass2 
{
	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		driver.findElement(By.id("email")).click();
		
		Robot robo= new Robot();
		String text="admin123gmail.com";
		
		for(char c:text.toCharArray())
		{
			int finalText=KeyEvent.getExtendedKeyCodeForChar(c);
			//getExtendedKeyCodeForChar--->it will work only for the alphaNumeric characters 
			// it will not work for the Special char
			
			
			robo.keyPress(finalText);
			robo.keyRelease(finalText);
			
		}
		
		
		
		
	}

}
