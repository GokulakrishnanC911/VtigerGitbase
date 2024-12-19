package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
 public static void main(String[] args) 
 {
	WebDriver w= new ChromeDriver();
	w.get("https://www.flipkart.com/");
	WebElement e = w.findElement(By.xpath("//img[@title='Flipkart']"));
	Rectangle r = e.getRect();
	int a = r.getHeight();
	int b = r.getWidth();
	System.out.println(a);
	System.out.println(b);
	w.close();
}
}
