package Products;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
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

public class Product_Create {
@Test
	public void Product_Create()throws Throwable 
	{
	WebDriver w;
	FileInputStream f = new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\Property.properties");
	Properties p = new Properties();
	p.load(f);
	String s = p.getProperty("Browser");
	String s1 = p.getProperty("Url");
	String s2 = p.getProperty("Username");
	String s3 = p.getProperty("Password");

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
	w.findElement(By.linkText("Products")).click();
	w.findElement(By.xpath("//img[@title='Create Product...']")).click();	
	Random r = new Random();
	int rn = r.nextInt(1000);	
	FileInputStream f1 = new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\excel.xlsx");	
	Workbook b = WorkbookFactory.create(f1);	
	Sheet sh = b.getSheet("Products");
	Row ro = sh.getRow(0);
	Cell ce = ro.getCell(0);
	String e = ce.getStringCellValue() + rn;
	System.out.println(e);
	w.findElement(By.name("productname")).sendKeys(e);
	w.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
	Thread.sleep(2000);
	String ad = w.findElement(By.id("dtlview_Product Name")).getText();
	if(ad.contains(e))
	{
		System.out.println("Product name is Created");
	}
	else
	{
		System.out.println("Products name is not created");
	}
	w.findElement(By.cssSelector("[src=\"themes/softed/images/user.PNG\"]")).click();
	w.findElement(By.linkText("Sign Out")).click();
}
}
