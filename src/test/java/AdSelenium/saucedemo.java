package AdSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {
public static void main(String[] args) throws Throwable 
{
	WebDriver w= new ChromeDriver();
	FileInputStream f= new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\Property.properties");
	Properties p= new Properties();
	p.load(f);
	String s1= p.getProperty("Url");
	String s2 = p.getProperty("UserName");
	String s3 = p.getProperty("Password");
	w.get(s1);
	w.findElement(By.name("user-name")).sendKeys(s2);
	w.findElement(By.id("password")).sendKeys(s3);
	w.findElement(By.id("login-button")).click();
	w.close();
	
	
}
}
