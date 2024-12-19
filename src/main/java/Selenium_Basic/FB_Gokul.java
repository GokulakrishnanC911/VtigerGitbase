package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Gokul {
	public static void main(String[] args)
	{
		 WebDriver w= new ChromeDriver();
		 w.get("https://www.facebook.com/");
		 w.findElement(By.xpath("//input[@id='email']")).sendKeys("9976998457"); 
	     w.findElement(By.xpath("//input[@id='pass']")).sendKeys("9976998457@gk");
	     w.findElement(By.xpath("//button[contains(@id,'u_0_5')]")).click();
	     w.close();
	}

}
