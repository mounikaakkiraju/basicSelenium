package DDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertDataIntoExcel
{
	public static void main(String[] args) throws Throwable 
	{
		FileInputStream file = new FileInputStream("./amazon.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.createSheet("Sheet2");
		Row row = sheet.createRow(2);
		Cell cell = row.createCell(2);
		cell.setCellValue("iphone");
		
		FileOutputStream file1 = new FileOutputStream("./amazon.xlsx");
		book.write(file1);
		book.close();
	}

}
