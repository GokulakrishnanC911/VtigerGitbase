package AdSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Insert {
public static void main(String[] args) throws Throwable 
{
	FileInputStream f= new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\excel.xlsx");
	Workbook b= WorkbookFactory.create(f);
	Sheet s= b.getSheet("Sheet1");
	Row r= s.createRow(5);
	Cell c = r.createCell(5);
	c.setCellValue("Hello");
	FileOutputStream f2= new FileOutputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\excel.xlsx");
	b.write(f2);
}
}
