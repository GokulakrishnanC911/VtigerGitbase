package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB {
	public static void main(String[] args) 
	{
		    WebDriver w = new ChromeDriver();
		    w.get("https://www.facebook.com/");
	        w.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
	        w.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc");
	        w.findElement(By.xpath("//button[@name='login']")).click();
	        w.close();
	}

}
