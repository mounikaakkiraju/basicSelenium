import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributes 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		WebElement ele = driver.findElement(By.xpath("//label[@for='countries']"));
		String val=ele.getAttribute("for");
		System.out.println(val);
		
	}

}
