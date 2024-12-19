package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver w= new ChromeDriver();
		w.get("https://www.facebook.com/");
		w.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement d= w.findElement(By.id("day"));
		Select s=new Select(d);
		s.selectByValue("23");
		Thread.sleep(2000);
		WebElement m=w.findElement(By.id("month"));
		Select s1= new Select(m);
		s1.selectByVisibleText("Jan");
		Thread.sleep(2000);
		WebElement y=w.findElement(By.id("year"));
		Select s2=new Select(y);
		s2.selectByIndex(5);
		Thread.sleep(2000);
		w.close();	
}
}
