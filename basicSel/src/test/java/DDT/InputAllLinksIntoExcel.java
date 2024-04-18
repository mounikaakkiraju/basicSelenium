package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputAllLinksIntoExcel
{
	public static void main(String[] args) throws Throwable 
	{

		FileInputStream file = new FileInputStream("C:\\Users\\mouni\\OneDrive\\Documents\\Example.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("Sheet1");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count=0;
		for(int i=0;i<=links.size();i++)
		{
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(links.get(i).getAttribute("herf"));
			count++;
		}
		System.out.println(count);
		
		

		FileOutputStream file1 = new FileOutputStream("C:\\Users\\mouni\\OneDrive\\Documents\\Example.xlsx");
		book.write(file1);;
		book.close();
		
	}

}
