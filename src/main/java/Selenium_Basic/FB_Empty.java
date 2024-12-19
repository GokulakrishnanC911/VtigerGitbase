package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Empty {
	public static void main(String[] args) throws InterruptedException {
        WebDriver w = new ChromeDriver();
        w.get("https://www.facebook.com/");
        w.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(2000);

        WebElement e = w.findElement(By.xpath("//input[@name='firstname']"));
        e.sendKeys("abc");
        Thread.sleep(2000);
        String s = e.getAttribute("value");
        if (s.isEmpty()) 
        {
            System.out.println("Firstname field is empty");
        } 
        else
        {
            System.out.println("Firstname field is not empty");
        }
	    w.close();	
}
}
