package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class dimension 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.amazon.in");
		org.openqa.selenium.Dimension dim = new org.openqa.selenium.Dimension(600, 500);
		driver.manage().window().setSize(dim);
		
        org.openqa.selenium.Point po = new org.openqa.selenium. Point(500, 400);
        driver.manage().window().setPosition(po);
	}

}
