package Organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generic_Uilities.ExcelUtility;
import Generic_Uilities.FileUtility;
import Generic_Uilities.JavaUtilities;



public class Vtiger_Login {
	@Test
	public void Vtiger_Login( )  throws Throwable
{
	WebDriver w;
//	FileInputStream f = new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\Property.properties");
//	Properties p = new Properties();
//	p.load(f);
//	String s = p.getProperty("Browser");
//	String s1 = p.getProperty("Url");
//	String s2 = p.getProperty("Username");
//	String s3 = p.getProperty("Password");
	FileUtility fu = new FileUtility();
	String s= fu.getKeyAndValuePair("Browser");
	String s1=fu.getKeyAndValuePair("Url");
	String s2=fu.getKeyAndValuePair("Username");
	String s3=fu.getKeyAndValuePair("Password");
	if (s.equalsIgnoreCase("chrome")) 
	{
		w = new ChromeDriver();
	} 
	else if (s.equalsIgnoreCase("firefox")) 
	{
		w = new FirefoxDriver();
	} 
	else if (s.equalsIgnoreCase("edge"))
	{
		w = new EdgeDriver();
	}
	else 
	{
		w = new ChromeDriver();
	}
	w.get(s1);
	w.findElement(By.name("user_name")).sendKeys(s2);
	w.findElement(By.name("user_password")).sendKeys(s3);
	w.findElement(By.id("submitButton")).click();
	w.findElement(By.linkText("Organizations")).click();
	w.findElement(By.xpath("//img[@title='Create Organization...']")).click();	
//	Random r = new Random();
//	int rn = r.nextInt(1000);	
	 JavaUtilities ju = new JavaUtilities();
	int rn = ju.getRandomNum();
//	FileInputStream f1 = new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\excel.xlsx");	
//	Workbook b = WorkbookFactory.create(f1);	
//	Sheet sh = b.getSheet("Organization");
//	Row ro = sh.getRow(0);
//	Cell ce = ro.getCell(0);
//	String e = ce.getStringCellValue() + rn;
//	System.out.println(e);
	 ExcelUtility eu = new ExcelUtility();
	String e = eu.readExcelData("Organization", 0, 0)+rn;
//	Row ro1 = sh.getRow(1);
//	Cell ce1 = ro1.getCell(0);
//	DataFormatter d1 = new DataFormatter();
//	String e1 = d1.formatCellValue(ce1);
//	System.out.println(e1);
	String e1 = eu.readExcelDataUsingDataFormat("Organization", 1, 0);
//	Row ro2 = sh.getRow(2);
//	Cell ce2 = ro2.getCell(0);
//	DataFormatter d2 = new DataFormatter();
//	String e2 = d2.formatCellValue(ce2);
//	System.out.println(e2);
	String e2 = eu.readExcelDataUsingDataFormat("Organization", 2, 0);
	w.findElement(By.name("accountname")).sendKeys(e);
	w.findElement(By.id("phone")).sendKeys(e1);
	w.findElement(By.id("email1")).sendKeys(e2);
	w.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
	Thread.sleep(2000);
	String ad = w.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
	if (ad.contains(e))
	{
		System.out.println("Organization name is created");
		}
	else 
	{
		System.out.println("Organization name is not created");
	}
	w.findElement(By.cssSelector("[src=\"themes/softed/images/user.PNG\"]")).click();
	w.findElement(By.linkText("Sign Out")).click();
}
}
