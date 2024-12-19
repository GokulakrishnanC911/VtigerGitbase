package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHold {
public static void main(String[] args) 
{
	WebDriver w= new ChromeDriver();
	w.get("https://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");
	Actions a= new Actions(w);
	WebElement d1= w.findElement(By.id("dragdiv"));
	WebElement d2=w.findElement(By.id("dropdiv"));
	a.clickAndHold(d1).moveToElement(d2).release().build().perform();
	
}
}
