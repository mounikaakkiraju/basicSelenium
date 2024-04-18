package KeyActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class closeBrowsers 
{
	public static void main(String[] args) throws AWTException, IOException
	{
		Runtime r = Runtime.getRuntime();
		 Process b = r.exec("taskkill /im chrome.exe /f /t");
		
		//this is used to close all the browsers without launching it
		
		
		

	}

}
