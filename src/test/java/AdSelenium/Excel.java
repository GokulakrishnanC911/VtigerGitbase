package AdSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {
public static void main(String[] args) throws Throwable 
{
	FileInputStream f= new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\excel.xlsx");
	Workbook b = WorkbookFactory.create(f);
     org.apache.poi.ss.usermodel.Sheet s = b.getSheet("Sheet1");
	Row r= s.getRow(0);
	Cell c= r.getCell(0);
	String e= c.getStringCellValue();
	System.out.println(e);
}
}

