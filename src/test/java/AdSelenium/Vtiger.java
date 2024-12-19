package AdSelenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Vtiger {
public static void main(String[] args) throws Throwable
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
}
}
