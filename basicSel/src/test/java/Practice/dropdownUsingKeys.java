package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownUsingKeys
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		
		
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Thread.sleep(2000);
		day.click();
		day.sendKeys(Keys.ARROW_UP);
		day.sendKeys(Keys.ARROW_UP);
		day.sendKeys(Keys.ARROW_UP);
		
		WebElement month = driver.findElement(By.id("month"));
		month.click();
		month.sendKeys(Keys.ARROW_UP);
		month.sendKeys(Keys.ARROW_UP);
		
		WebElement year = driver.findElement(By.id("year"));
		year.click();
		year.sendKeys(Keys.ARROW_DOWN);
		year.sendKeys(Keys.ARROW_DOWN);
		year.sendKeys(Keys.ARROW_DOWN);
		
		
	}

}
