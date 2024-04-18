package POPUPS;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownloadToPath
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions opt = new ChromeOptions();
		
		HashMap<String, Object> map = new HashMap<String , Object>();
		map.put("download.default_directory", "C:\\Users\\mouni\\OneDrive\\Documents");
		opt.setExperimentalOption("prefs", map);
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/download?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.id("writeArea")).sendKeys("write something into the text field");
		driver.findElement(By.id("downloadButton")).click();
		
		
		
	}

}
