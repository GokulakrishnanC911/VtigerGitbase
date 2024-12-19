package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Create {
	public static void main(String[] args) 
	{
		WebDriver w= new ChromeDriver();
		w.get("https://www.facebook.com/");
		w.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		WebElement e=w.findElement(By.name("firstname"));
		e.sendKeys("admin");
		e.sendKeys(Keys.CONTROL+"a");
		e.sendKeys(Keys.BACK_SPACE);
	}

}
