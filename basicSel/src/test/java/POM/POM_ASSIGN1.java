package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_ASSIGN1
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		
		FileInputStream file=new FileInputStream("C:\\Users\\mouni\\java)\\basicSel\\New_propertyFile.properties.txt");

		Properties pro=new Properties();

		pro.load(file);

		String URL=pro.getProperty("AURL");
		
		driver.get(URL);
		
		FileInputStream file1 = new FileInputStream("C:\\Users\\mouni\\java)\\basicSel\\amazon.xlsx");
		
		Workbook book = WorkbookFactory.create(file1);
		 Sheet sheet = book.getSheet("Sheet1");
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
		String data=cell.getStringCellValue();
		
		POM_ASSGIN1 PA=new POM_ASSGIN1(driver);
		
		/*PA.getsearch().sendKeys(data);
		
		PA.getsubmit().click();
		
		WebElement product = PA.getProductName();
		System.out.println(product.getText());
		
		WebElement pri = PA.getPrice();
		System.out.println(pri.getText());*/
		
	
        PA.ProductPrice(data);
        
        	
        
		
	}

}
