package AdSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public static void main(String[] args) throws Throwable, Throwable {
	
		// step1:- Path setting of the Excel file
				FileInputStream fis = new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\excel.xlsx");

				//step2:- keep the File in read mode
				Workbook book = WorkbookFactory.create(fis);
			
			   //step3:- Navigating to the sheet
				Sheet sheet = book.getSheet("Sheet1");
			
				//Step4:- Navigating to the Row
				Row row = sheet.getRow(0);
			
				//Step5:- Navigating to the Cell
				Cell cell = row.getCell(0);
			
				 double ExcelData = cell.getNumericCellValue();
				System.out.println(ExcelData);
	}

}
