package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_examazon 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("rebook",Keys.ENTER);
		
		WebElement data = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base a-text-center'])[1]/descendant::span[text()='₹753']"));
	     System.out.println(data.getText());
	
	}

}
