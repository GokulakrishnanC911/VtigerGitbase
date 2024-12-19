package Selenium_Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sum {
public static void main(String[] args)
{
	WebDriver w= new ChromeDriver();
	w.get("file:///C:/Users/Gokulakrishnan/Desktop/HTML/webtable.html");
	List<WebElement> l= w.findElements(By.xpath("//tr[td[1] = '']/td[3]"));
	for(int i=0;i<l.size();i++)
	{
		WebElement e=l.get(i);
		String s=e.getText();
		System.out.println(s);
		Boolean b =e.isDisplayed();
		 if(b)
		 {
			 System.out.println("Sum of Marks is Equal to Total Marks");
		 }
		 else
		 {
			 System.out.println("Sum of Marks is not Equal to Total Marks");
		 }
	}
}
}
