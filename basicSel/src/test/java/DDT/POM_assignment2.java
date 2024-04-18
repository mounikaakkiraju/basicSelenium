package DDT;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.POM_assign2;

public class POM_assignment2
{
	
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver =new ChromeDriver();
		
		FileInputStream file=new FileInputStream("C:\\Users\\mouni\\java)\\basicSel\\New_propertyFile.properties.txt");
		
		Properties pro=new Properties();
		pro.load(file);
		
		String URL = pro.getProperty("FURL");
		
		driver.get(URL);
		
		FileInputStream file1 = new FileInputStream("./amazon.xlsx");
		Workbook book = WorkbookFactory.create(file1);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		
		POM_assign2 flip = new POM_assign2(driver);
		
		//****using getter methods***
		
		/*flip.getpopup().click();
		flip.getsearch().sendKeys(data);
		flip.getsearch().submit();
		System.out.println(flip.getProductName().getText());
		System.out.println(flip.getprice().getText());*/
		
		//****using business class*********
		
		flip.flipkart(data);
		
		
	}

}
