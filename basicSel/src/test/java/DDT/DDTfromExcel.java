package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDTfromExcel 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
	    FileInputStream file = new FileInputStream("./amazon.xlsx");
	    
	   Workbook book = WorkbookFactory.create(file);
	   Sheet sheet = book.getSheet("Sheet1");
	   Row row = sheet.getRow(1);
	   Cell cell = row.getCell(1);
	   String data = cell.getStringCellValue();
	   
	   System.out.println(data);
	   
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys(data);
		
	}

}
