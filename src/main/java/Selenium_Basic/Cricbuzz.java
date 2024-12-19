package Selenium_Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {
	public static void main(String[] args)
	{
		WebDriver w= new ChromeDriver();
		w.get("https://www.cricbuzz.com/");
		w.findElement(By.xpath("//span[@title='India A']")).click();
		w.findElement(By.xpath("//a[text()='Scorecard']")).click();
		List<WebElement> l = w.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']"));
		for(int i=0;i<l.size();i++)
		{
			WebElement e=l.get(i);
			String s=e.getText();
			System.out.println(s);
		}
		w.close();
	}

}
