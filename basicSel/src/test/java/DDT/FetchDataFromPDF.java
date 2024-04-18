package DDT;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentNameDictionary;
import org.apache.pdfbox.text.PDFTextStripper;

public class FetchDataFromPDF
{
	public static void main(String[] args) throws Throwable
	{
		File file = new File("C:\\Users\\mouni\\Downloads\\Q_resume.pdf");
		PDDocument pdf = PDDocument.load(file);
		
		PDFTextStripper pd = new PDFTextStripper();
		System.out.println(pd.getText(pdf));
		
	}

}
