import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenInApp 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        driver.get("https://openinapp.com/");
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		driver.findElement(By.xpath("//p[text()='Login with Phone']")).click();
		
		
		WebElement phoneNumberInput = driver.findElement(By.id("Enter Phone Number"));
		phoneNumberInput.sendKeys("7416590887");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		WebElement requestOTPButton = driver.findElement(By.xpath("//p[text()='Send OTP']"));
		requestOTPButton.click();
		
		Thread.sleep(3000);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter OTP");
		int OTP=sc.nextInt();
		
		System.out.println(OTP);
		
		WebElement data = driver.findElement(By.xpath("//input[@autocomplete='one-time-code']"));
	//	data.sendKeys(OTP);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.get("https://openinapp.com/");
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		driver.findElement(By.xpath("//p[text()='Login with Phone']")).click();
		
		
		WebElement phoneNumberInput = driver.findElement(By.id("Enter Phone Number"));
		phoneNumberInput.sendKeys("7416590887");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		WebElement requestOTPButton = driver.findElement(By.xpath("//p[text()='Send OTP']"));
		requestOTPButton.click();
		
		Thread.sleep(2000);
		
		driver.get("https://web.whatsapp.com/");
		
		

		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement otpMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Your OTP is:')]")));

		String otpMessageText = otpMessage.getText();
		String otp = otpMessageText.split(":")[1].trim();
		
		WebElement otpInput = driver.findElement(By.id("yourOTPInputId"));
		otpInput.sendKeys(otp);
		
		WebElement loginButton = driver.findElement(By.id("loginButtonId"));
		loginButton.click();*/



		
	}	
}
