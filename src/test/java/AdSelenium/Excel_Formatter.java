package AdSelenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Formatter {
	public static void main(String[] args) throws Throwable 
	{
		FileInputStream f= new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\excel.xlsx");
		Workbook b = WorkbookFactory.create(f);
	     org.apache.poi.ss.usermodel.Sheet s = b.getSheet("Sheet1");
		Row r= s.getRow(0);
		Cell c= r.getCell(0);
		DataFormatter d=new DataFormatter();
		String e= d.formatCellValue(c);
		System.out.println(e);
}
}
