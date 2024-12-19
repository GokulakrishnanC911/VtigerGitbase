package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Text {
	public static void main(String[] args) 
	{
		WebDriver w = new ChromeDriver();
		w.get("https://www.facebook.com/");
		   String s = w.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		   System.out.println(s);
		   w.close();
	}

}
