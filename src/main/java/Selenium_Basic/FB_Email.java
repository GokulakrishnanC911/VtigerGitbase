package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Email {
public static void main(String[] args)
{
	WebDriver w = new ChromeDriver();
	w.get("https://www.facebook.com/");
	WebElement e = w.findElement(By.xpath("//input[@id='email']"));
	WebElement e1= w.findElement(By.xpath("//input[@name='pass']"));
	Rectangle emailRect = e.getRect();
	Rectangle passwordRect= e.getRect();
	 if (emailRect.getHeight() == passwordRect.getHeight() && emailRect.getWidth() == passwordRect.getWidth())
	 {
         System.out.println("Email and Password dimensions are the same.");
     } 
	 else 
     {
         System.out.println("Email and Password dimensions are different.");
     }
 
}
}
