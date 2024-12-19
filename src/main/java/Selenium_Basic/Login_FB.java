package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_FB {
	public static void main(String[] args) 
	{
		WebDriver w= new ChromeDriver();
		w.get("https://www.facebook.com/");
	   WebElement e=w.findElement(By.xpath("//input[@id='email']"));
	  e.sendKeys("admin");
	  e.sendKeys(Keys.CONTROL+"a");
	  e.sendKeys(Keys.CONTROL+"c");
	 w.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.CONTROL+"v");
	}

}
