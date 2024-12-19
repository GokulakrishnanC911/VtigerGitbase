package Campaigns;

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
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Uilities.BaseClass;
import Generic_Uilities.ExcelUtility;
import Generic_Uilities.FileUtility;
import Generic_Uilities.JavaUtilities;
import Generic_Uilities.WebDriverUtility;
import ObjectRepo.CampDetailedPage;
import ObjectRepo.CampValidatePage;
import ObjectRepo.CreateCampPage;
import ObjectRepo.LoginVtigerPage;
import ObjectRepo.VtigerHomePage;
import net.bytebuddy.description.type.TypeDescription.Generic;
//@Listeners(Generic_Uilities.Listener.class)
@Listeners(Generic_Uilities.ExtentReport.class)
public class Campaign_Create extends BaseClass  {
	@Test
    public void Campaign_Create() throws Throwable 
	{
		//Gud Mrng
		WebDriverUtility wu = new WebDriverUtility();
        JavaUtilities ju = new JavaUtilities();
        ExcelUtility eu = new ExcelUtility();
        FileUtility fu = new FileUtility();
//	FileInputStream f = new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\Property.properties");
//	Properties p = new Properties();
//	p.load(f);
//	String s = p.getProperty("Browser");
//	String s1 = p.getProperty("Url");
//	String s2 = p.getProperty("Username");
//	String s3 = p.getProperty("Password");
//	FileUtility fu = new FileUtility();
//	String s= fu.getKeyAndValuePair("Browser");
//	String s1=fu.getKeyAndValuePair("Url");
//	String s2=fu.getKeyAndValuePair("Username");
//	String s3=fu.getKeyAndValuePair("Password");
//	if (s.equalsIgnoreCase("chrome")) 
//	{
//		w = new ChromeDriver();
//	} 
//	else if (s.equalsIgnoreCase("firefox")) 
//	{
//		w = new FirefoxDriver();
//	} 
//	else if (s.equalsIgnoreCase("edge"))
//	{
//		w = new EdgeDriver();
//	}
//	else 
//	{
//		w = new ChromeDriver();
//	}
//	String s= fu.getKeyAndValuePair("Browser");
//        String s1 = fu.getKeyAndValuePair("Url");
//        String s2 = fu.getKeyAndValuePair("Username");
//        String s3 = fu.getKeyAndValuePair("Password");
//        w.get(s1);
//	w.findElement(By.name("user_name")).sendKeys(s2);
//	w.findElement(By.name("user_password")).sendKeys(s3);
//	w.findElement(By.id("submitButton")).click();
//	LoginVtigerPage l = new LoginVtigerPage(w);
//	l.getUserTextField().sendKeys(s2);
//	l.getUserpasswordField().sendKeys(s3);
//	l.getUserLoginButton().click();
//        LoginVtigerPage l = new LoginVtigerPage(w);
//        l.LoginIntoVtigerPage(s2, s3);
//	w.findElement(By.linkText("More")).click();
//	w.findElement(By.linkText("Campaigns")).click();
//        VtigerHomePage h = new VtigerHomePage(w);
//        h.clickMoreLink();
//        h.clickCampLink();
//	w.findElement(By.cssSelector("[alt=\"Create Campaign...\"]")).click();
        CampDetailedPage img = new CampDetailedPage(w);
        img.clickCampLookUpImg();
//	Random r = new Random();
//	int rn = r.nextInt(1000);	
        int rn = ju.getRandomNum();
//	FileInputStream f1 = new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\excel.xlsx");	
//	Workbook b = WorkbookFactory.create(f1);	
//	Sheet sh = b.getSheet("Campaigns");
//	Row ro = sh.getRow(0);
//	Cell ce = ro.getCell(0);
//	String e = ce.getStringCellValue() + rn;
//	System.out.println(e);
//	ExcelUtility eu = new ExcelUtility();
	String e = eu.readExcelData("Campaigns", 0, 0)+rn;
//	w.findElement(By.name("campaignname")).sendKeys(e);
//    w.findElement(By.cssSelector("[title=\"Save [Alt+S]\"]")).click();
	CreateCampPage cp = new CreateCampPage(w);
    cp.enterCampName(e);
    cp.clickSaveButton();
//     String ad = w.findElement(By.id("dtlview_Campaign Name")).getText();
//     if(ad.contains(e))
//     {
//    	 System.out.println("Campaign Name is Created");
//     }
//     else
//     {
//    	 System.out.println("Campaign Name is not Created");
//     }
    CampValidatePage cv = new CampValidatePage(w);
    String ad = cv.validateCampaign(w, e);
    Assert.assertEquals(ad, e);
    System.out.println("Campaign page is created");
//     w.findElement(By.cssSelector("[src=\"themes/softed/images/user.PNG\"]")).click();
// 	w.findElement(By.linkText("Sign Out")).click();
//    h.logoutApp();
}
}
