import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		
		
		WebElement coun = driver.findElement(By.xpath("//select[@id='select3']"));
		
		Select  sel=new Select(coun);
//		List<WebElement> opt = sel.getOptions();
//		for(WebElement all:opt)
//		{
//			System.out.println(all.getText());
//			
//		}
		
		ArrayList<String> list = new ArrayList<String>();
		List<WebElement> opts = sel.getOptions();
	 
		//Collections.reverse(opts);
	    //System.out.println(opts);
	    
//		for(WebElement all:opts)
//		{
//			list.add(all.getText());
//		}
//		Collections.reverseOrder();
//		for(String finalRes:list)
//		{
//			System.out.println(finalRes);
//		}
		
		
		
		
		
		
	}

}
