package DataDriven_TY;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GettingDataFromExcel
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\mouni\\OneDrive\\Documents\\sample1.xlsx");
		
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("Sheet1");
		 Row row = sheet.getRow(0);
		 Cell cell = row.getCell(0);
		 String text = cell.getStringCellValue();
		 System.out.println(text);
		 
		 int LastRow = sheet.getLastRowNum();
		 int LastCell = row.getLastCellNum();
		 System.out.println(LastRow);
		 System.out.println(LastCell);
		 
		 System.out.println("-----");
		 
		 for(int i=0;i<=LastRow;i++)
		 {
			 for(int j=0;j<LastCell;j++)
			 {
				 String TotalText = sheet.getRow(i).getCell(j).getStringCellValue();
				 
				 System.out.print(TotalText+" ");
			 }
			 System.out.println();
		 }
		 
		
		
		
		
		
		
	}

}
