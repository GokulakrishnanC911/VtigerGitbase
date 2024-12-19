package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
public static void main(String[] args) 
{
	WebDriver w= new ChromeDriver();
	w.get("https://demo.automationtesting.in/Frames.html");
//	w.switchTo().frame(0);
//	w.switchTo().frame("singleframe");
	WebElement f= w.findElement(By.xpath("//iframe[@id='singleframe']"));
	w.switchTo().frame(f);
	w.findElement(By.xpath("//input[@type='text']")).sendKeys("sfhh");
}
}
