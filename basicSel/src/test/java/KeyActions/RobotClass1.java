package KeyActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass1 
{
	public static void main(String[] args) throws AWTException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		Robot robo= new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_CONTROL);
	    robo.keyPress(KeyEvent.VK_V);
	    robo.keyRelease(KeyEvent.VK_CONTROL);
	    robo.keyRelease(KeyEvent.VK_V);
	    
	  //  robo.keyRelease(KeyEvent.VK_CAPS_LOCK);--->TO change the text to Uppercase
	    
		
		
		
	}

}
