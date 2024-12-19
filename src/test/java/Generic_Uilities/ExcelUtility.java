package Generic_Uilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
public String readExcelData(String SheetName,int RowNum,int CellNum) throws Throwable
{
FileInputStream f = new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\excel.xlsx");	
Workbook b = WorkbookFactory.create(f);	
Sheet sh = b.getSheet(SheetName);
Row ro = sh.getRow(RowNum);
Cell ce = ro.getCell(0);
String e = ce.getStringCellValue() ;
System.out.println(e);
return e;
}
public String readExcelDataUsingDataFormat(String SheetName,int RowNum,int CellNum) throws Throwable
{
	FileInputStream f1 = new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\excel.xlsx");	
	Workbook b = WorkbookFactory.create(f1);	
	Sheet sh = b.getSheet(SheetName);
	Row ro = sh.getRow(RowNum);
	Cell ce = ro.getCell(CellNum);
	String e = ce.getStringCellValue();
	System.out.println(e);
	Row ro1 = sh.getRow( RowNum);
	Cell ce1 = ro1.getCell(CellNum);
	DataFormatter d1 = new DataFormatter();
	String e1 = d1.formatCellValue(ce1);
	System.out.println(e1);
	return e1;
	
}
public Object[][] readExcelDataForDataProvider(String sheetName) throws Throwable

{
	FileInputStream f = new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\excel.xlsx");

	Workbook b = WorkbookFactory.create(f);

	Sheet sh = b.getSheet(sheetName);

	int lastRow = sh.getLastRowNum() + 1;
	int lastCell = sh.getRow(0).getLastCellNum();

	Object[][] obj = new Object[lastRow][lastCell];

	for (int i = 0; i < lastRow; i++) 
	{
		for (int j = 0; j < lastCell; j++) 
		{
			obj[i][j] = sh.getRow(i).getCell(j).toString();
		}
	}
	return obj; 
}
}

