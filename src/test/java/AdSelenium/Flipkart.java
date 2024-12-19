package AdSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws Throwable
	{
		FileInputStream f= new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\excel.xlsx");
		Workbook b= WorkbookFactory.create(f);
		Sheet s= b.getSheet("Sheet2");
       WebDriver w= new ChromeDriver();
      w.get("https://www.flipkart.com/");
     w.manage().window().maximize();
     List <WebElement> l= w.findElements(By.xpath("//a"));
     for (int i=0;i<l.size();i++)
     {
    	 Row r= s.createRow(i);
    	 Cell c= r.createCell(0);
    	 c.setCellValue(l.get(i).getAttribute("href"));
     }
     FileOutputStream f2=new FileOutputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\excel.xlsx");
     b.write(f2);
     
	}
}
