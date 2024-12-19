package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart {
	public static void main(String[] args) {
		 WebDriver w = new ChromeDriver();
	        w.get("https://www.flipkart.com/");
	        w.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("REDMI 9 Activ (Coral Green, 128 GB)");
	        w.findElement(By.xpath("//button[@type='submit']")).click();
	        WebElement e = w.findElement(By.xpath("//div[contains(@class,'Nx9bqj')]"));
	        String s = e.getText();
	        System.out.println(s);
	        w.close();
}
}
