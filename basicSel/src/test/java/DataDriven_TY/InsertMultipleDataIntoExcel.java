package DataDriven_TY;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertMultipleDataIntoExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{

		FileInputStream file = new FileInputStream("C:\\Users\\mouni\\OneDrive\\Documents\\sample1.xlsx");
		 
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.createSheet("Sheet9");
		Row row = sheet.createRow(0);
		//Cell cell = row.createCell(0);
		
//		for(int i=0;i<=26;i++)
//		{
//			
//			
//				sheet.createRow(i).createCell(0).setCellValue("hi");
//					
//		}
		
		for(int j=1;j<26;j++)
		{
			for(char ch='a';ch<='z';ch++)
			{
				sheet.createRow(j).createCell(1).setCellValue(ch);
			}
		}
		
		
		FileOutputStream fis = new FileOutputStream("C:\\Users\\mouni\\OneDrive\\Documents\\sample1.xlsx");
		book.write(fis);
		book.close();
		
		System.out.println("data inserted successfully");
		
	}

}
