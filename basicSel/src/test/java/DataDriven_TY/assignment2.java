package DataDriven_TY;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class assignment2
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\mouni\\OneDrive\\Documents\\sample1.xlsx");
		Workbook book = WorkbookFactory.create(file);
		 Sheet sheet = book.getSheet("Sheet1");
		      Row row= sheet.getRow(0);
		       Cell cell = row.getCell(0);
		      
		       String ex="test";
		       
		      int LastRow=sheet.getLastRowNum();
		      int  LastCell=row.getLastCellNum();
		     
		     
		      for(int i=0;i<=LastRow;i++)
				 {
		    	  
		    	  String Text = sheet.getRow(i).getCell(0).getStringCellValue();
		    	 
		    	  if(Text.equals(ex))
	    		  {	  
				    		  int LCell=sheet.getRow(i).getLastCellNum();
				    		  
				    		  for(int j=0;j<=LastCell;j++)
				    		  {
				    			  String TextVal=sheet.getRow(i).getCell(j).getStringCellValue();
				    		     System.out.print(TextVal+" ");
				    			
	    		            		  
				    		  } 	  
				  }  
				 }
	}
}
