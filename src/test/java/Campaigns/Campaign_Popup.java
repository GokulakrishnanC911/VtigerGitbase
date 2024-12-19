package Campaigns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

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

import Generic_Uilities.BaseClass;
import Generic_Uilities.ExcelUtility;
import Generic_Uilities.FileUtility;
import Generic_Uilities.JavaUtilities;
import Generic_Uilities.WebDriverUtility;

public class Campaign_Popup extends BaseClass{
	@Test
	public void Campaign_Popup() throws Throwable
	{
		WebDriver w;
		WebDriverUtility wu = new WebDriverUtility();
//		FileInputStream f = new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\Property.properties");
//		Properties p = new Properties();
//		p.load(f);
//		String s = p.getProperty("Browser");
//		String s1 = p.getProperty("Url");
//		String s2 = p.getProperty("Username");
//		String s3 = p.getProperty("Password");
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
		w.findElement(By.linkText("Products")).click();
		w.findElement(By.xpath("//img[@title='Create Product...']")).click();
		wu.Maximize(w);
		wu.waitForPageLoad(w);
//		Random r = new Random();
//		int rn = r.nextInt(1000);	
		JavaUtilities ju = new JavaUtilities();
		int rn = ju.getRandomNum();
//		FileInputStream f1 = new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\excel.xlsx");	
//		Workbook b = WorkbookFactory.create(f1);	
//		Sheet sh = b.getSheet("Products");
//		Row ro = sh.getRow(0);
//		Cell ce = ro.getCell(0);
//		String e = ce.getStringCellValue() + rn;
//		System.out.println(e);
		ExcelUtility eu = new ExcelUtility();
		String e = eu.readExcelData("Products", 0, 0)+rn;
		System.out.println(e);
		w.findElement(By.name("productname")).sendKeys(e);
		w.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		w.findElement(By.linkText("More")).click();
		w.findElement(By.linkText("Campaigns")).click();
		w.findElement(By.cssSelector("[alt=\"Create Campaign...\"]")).click();	
//		Random r1 = new Random();
//		int rn1 = r1.nextInt(1000);
//		FileInputStream f2 = new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\excel.xlsx");	
//		Workbook b1 = WorkbookFactory.create(f2);	
//		Sheet sh1 = b1.getSheet("Campaigns");
//		Row ro1 = sh1.getRow(0);
//		Cell ce1 = ro1.getCell(0);
//		String e1= ce1.getStringCellValue() + rn1;
//		System.out.println(e1);
		ExcelUtility eu1 = new ExcelUtility();
		String e1 = eu.readExcelData("Campaigns", 0, 0)+rn;
		System.out.println(e1);
		Thread.sleep(2000);
		w.findElement(By.name("campaignname")).sendKeys(e1);
		w.findElement(By.cssSelector("[alt=\"Select\"]")).click();
//		Set<String> aw = w.getWindowHandles();
//		Iterator<String> it = aw.iterator();
//
//		while (it.hasNext()) 
//		{
//			String win = it.next();
//			w.switchTo().window(win);
//			String str = w.getTitle();
//			if (str.contains("Products&action"))
//
//			{
//				break;
//			}
//		}
	    wu.windowSwtiching(w,"Products&action");
		w.findElement(By.name("search_text")).sendKeys(e);
		w.findElement(By.name("search")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//a[text()='"+e+"']")).click();
//		Set<String> aw1 = w.getWindowHandles();
//		Iterator<String> it1 = aw1.iterator();
//
//		while (it1.hasNext()) 
//		{
//			String wi1 = it1.next();
//			w.switchTo().window(wi1);
//			String str1 = w.getTitle();
//			if (str1.contains("Campaigns&action"))
//
//			{
//				break;
//			}
//         }
     wu.windowSwtiching(w,"Campaigns&action");
   w.findElement(By.cssSelector("[title=\"Save [Alt+S]\"]")).click();
		
		String ad1 = w.findElement(By.id("dtlview_Campaign Name")).getText();
	
	if(ad1.contains(e1))
	{
		System.out.println("Campaign Name is Created");
		}
	else
	{
		System.out.println("Campaign Name is not Created");
	}
	 String ad2 = w.findElement(By.xpath("//span[@id='dtlview_Product']")).getText();
     
     if(ad2.contains(e))
     {
     	System.out.println("Product Name is created");
     }
     else
     {
     	System.out.println("Product Name is not Created");
     }
	 w.findElement(By.cssSelector("[src=\"themes/softed/images/user.PNG\"]")).click();
     w.findElement(By.linkText("Sign Out")).click();
}
}
