package Selenium_Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) 
	{
		WebDriver w= new ChromeDriver();
		w.get("https://www.amazon.in/");
		List<WebElement> l = w.findElements(By.xpath("//img"));
		int a =l.size();
		System.out.println("Total no.of Image = "+a);
		w.close();
	}

}
