package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import oracle.jdbc.OracleDriver;

public class Assignment 
{
	public static void main(String[] args) throws InterruptedException, SQLException
	
	{
//        WebDriver driver= new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("http://rmgtestingserver:8084/");
//		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
//		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
//		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
//		
//		driver.findElement(By.linkText("Projects")).click();
//		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
//		
//		WebElement exp = driver.findElement(By.name("projectName"));
//		exp.sendKeys("AKM__09");
//		driver.findElement(By.name("createdBy")).sendKeys("AKM5");
//		
//		
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		
		OracleDriver driver2 = new OracleDriver();
		DriverManager.registerDriver(driver2);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@rmgtestingserver:3333:xe\r\n"+ "", "root@%","root");
		Statement sta = con.createStatement();
		
		String que="select * from project where ProjectName='AKM_05";
		
         ResultSet result = sta.executeQuery(que);
		 
		 while(result.next())
			{
				System.out.println(result.getString(1));
				
//				 if(exp.equals(result))
//				 {
//					 System.out.println("yes");
//				 }
				
			}
		 
		
		 
		 con.close();
		
		
		
		
		
		
	}

}
