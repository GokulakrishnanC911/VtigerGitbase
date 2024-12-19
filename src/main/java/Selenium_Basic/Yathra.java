package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Yathra {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver w= new ChromeDriver();
		w.get("https://www.yatra.com/");
		Thread.sleep(3000);
		Actions a = new Actions(w);
		WebElement e = w.findElement(By.xpath("(//span[text()='+ More']"));
		Thread.sleep(3000);
		a.moveToElement(e).perform();
		Thread.sleep(3000);
		w.findElement(By.linkText("Trains")).click();
//		Thread.sleep(3000);
		w.close();
		
	}

}
