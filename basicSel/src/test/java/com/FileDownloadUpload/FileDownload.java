package com.FileDownloadUpload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/download?sublist=0");
		driver.findElement(By.id("writeArea")).sendKeys("qwertyuiop[");
		driver.findElement(By.id("downloadButton")).click();
		
	}

}
