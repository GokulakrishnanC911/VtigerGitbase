package AdSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasket {
	public static void main(String[] args)
	{
		WebDriver w= new ChromeDriver();
		w.get("https://www.bigbasket.com/");
		w.findElement(By.xpath("//input[@type='text']")).sendKeys("graps");
//		List<WebElement> l = w.findElements(By.xpath("//span[@class='flex-1 flex items-center mr-2.5 overflow-hidden']/li"));
//		int s=l.size();
//		System.out.println(s);
//		if(s>17)
//		{
//			WebElement e = l.get(17);
//			e.click();
//		}
	}
}
