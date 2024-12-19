package TestNG;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Uilities.ExcelUtility;
import Generic_Uilities.JavaUtilities;

public class DataProviderExp2 {
	@Test(dataProvider="readData")
public void CreateOrganization(String name,String phnnumber,String email) throws Throwable
{
	WebDriver w= new ChromeDriver();
	w.get(" http://localhost:8888");
	w.manage().window().maximize();
	
	w.findElement(By.name("user_name")).sendKeys("admin");
	w.findElement(By.name("user_password")).sendKeys("admin");
	w.findElement(By.id("submitButton")).click();
	w.findElement(By.linkText("Organizations")).click();
	w.findElement(By.xpath("//img[@title='Create Organization...']")).click();	
	w.findElement(By.name("accountname")).sendKeys(name);
	w.findElement(By.name("phone")).sendKeys(phnnumber);
	w.findElement(By.id("email1")).sendKeys(email);
	w.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	Thread.sleep(2000);
	w.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	w.findElement(By.linkText("Sign Out")).click();
	w.quit();
}
@DataProvider
public Object[][] readData() throws Throwable
{
ExcelUtility eu = new ExcelUtility();	
Object[][] values = eu.readExcelDataForDataProvider("DataProvider");
	return values;
	
}
}
