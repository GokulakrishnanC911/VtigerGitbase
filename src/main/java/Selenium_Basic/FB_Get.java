package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Get {
	public static void main(String[] args) 
	{
		WebDriver w = new ChromeDriver();
		w.get("https://www.facebook.com/");
		WebElement e =w.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String s=e.getTagName();
		System.out.println(s);
		String s1= e.getAttribute("href");
		System.out.println(s1);
		String s2= e.getText();
		System.out.println(s2);
		w.close();
	}

}
