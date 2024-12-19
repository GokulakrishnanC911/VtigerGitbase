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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic_Uilities.JavaUtilities;



public class Products_Delete {
	@Test
	public void Products_Delete() throws Throwable 
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
//		Random r = new Random();
//		int rn = r.nextInt(1000);
		JavaUtilities ju = new JavaUtilities();
		int rn = ju.getRandomNum();
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
		w.findElement(By.linkText("Products")).click();
//		w.findElement(By.xpath("//table[@class='lvt small']//a[text()='Product Name']/../preceding-sibling::td//input[@type='checkbox']")).click();
		w.findElement(By.xpath("//table[@class='lvt small']//a[text()='"+e+"']/../preceding-sibling::td//input[@type='checkbox']")).click();
		w.findElement(By.xpath("//input[@value='Delete']")).click();
		w.switchTo().alert().accept();
		WebElement we=w.findElement(By.xpath("//table[@class='lvt small']//a[text()='"+e+"']"));
		if(we.equals(e))
		{
			System.out.println("Product Name is Present");
		}
		else
		{
			System.out.println("Product name is not Present");
		}
		Thread.sleep(2000);
		WebElement we1 = w.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		Actions a = new Actions(w);
		a.moveToElement(we1).perform();
		w.switchTo().alert().accept();
		w.findElement(By.linkText("Sign Out")).click();

}
}
