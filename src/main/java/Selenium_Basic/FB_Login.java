package Selenium_Basic;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login {
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	WebDriver w= new ChromeDriver();
	w.get("https://www.facebook.com/");
	Workbook b= WorkbookFactory.create(new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\excel.xlsx"));
	org.apache.poi.ss.usermodel.Sheet s = b.getSheet("Sheet1");
	Row r=s.getRow(1);
    String un = r.getCell(0).toString();
	String pwd= r.getCell(1).toString();
	w.findElement(By.id("email")).sendKeys(un);
	w.findElement(By.id("pass")).sendKeys(pwd);
	w.findElement(By.xpath("//button[contains(@id,'u_0_5')]")).click();
}
}

