package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra_date {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver w= new ChromeDriver();
		w.get("https://www.yatra.com/");
		Thread.sleep(2000);
		w.findElement(By.xpath("//input[@id='BE_flight_origin_date']")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//div[@class='active-month-holder']/../../../..//td[@title='Friday, 27 September 2024']")).click();
		Thread.sleep(2000);
		w.close();
	}

}
