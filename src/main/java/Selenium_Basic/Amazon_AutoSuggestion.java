package Selenium_Basic;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_AutoSuggestion {
	public static void main(String[] args)
	  {
		WebDriver w= new ChromeDriver();
		w.get("https://www.amazon.in/");
		w.findElement(By.id("twotabsearchtextbox")).sendKeys(" Bluetooth mouse");
		List<WebElement> l = w.findElements(By.xpath("/div[contains(@class,'s-suggestion')]/span[contains(text(), 'Bluetooth mouse')]"));
		int s=l.size();
		System.out.println(s);
	if(s>1)
	{
	WebElement e=l.get(1);
	e.click();
	String st=w.getTitle();
	System.out.println("Page title selected suggestion "+st);
	}
	else
	{
		System.out.println("page title suggestion not founded");
	}

	  }
}


