package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Size_Location {
	public static void main(String[] args)
	{
		WebDriver w= new ChromeDriver();
		w.get("https://www.facebook.com/");
		WebElement e = w.findElement(By.xpath("//input[@id='email']"));
		 Dimension d = e.getSize();
		 int h1 = d.getHeight();
		 int w1= d.getWidth();
		 System.out.println("Email Height=  "+h1);
		 System.out.println("Email Width=  "+w1);
		 Point p = e.getLocation();
		 int x=p.getX();
		 int y=p.getY();
		 System.out.println("X Position = "+x);
		 System.out.println("Y Position = "+y);
		 w.close();
	}

}
