package Selenium_Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_Month {
	
public static void main(String[] args) throws InterruptedException 
{

	WebDriver w= new ChromeDriver();
	w.get("https://www.facebook.com/");
	Thread.sleep(2000);
	w.findElement(By.linkText("Create new account")).click();
	Thread.sleep(2000);
	WebElement e=w.findElement(By.id("month"));
	Select s = new Select(e);
	List<WebElement> l =s.getOptions();
	for(int i=1;i<l.size();i=i+2)
	{
		s.selectByIndex(i);
	}
	WebElement e1=s.getFirstSelectedOption();
	System.out.println(e1.getText());
	w.close();
}
}
