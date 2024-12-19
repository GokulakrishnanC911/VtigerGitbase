package Selenium_Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MakeMyTrip {
public static void main(String[] args) 
{
	WebDriver w= new ChromeDriver();
	w.get("https://www.makemytrip.com/");
	w.findElement(By.id("fromCity")).click();
	WebElement e= w.findElement(By.xpath("//input[@placeholder='From']"));
	e.sendKeys("Chennai");
	w.findElement(By.xpath("//p[contains(text(),'Chennai, India')]")).click();
	WebElement e1= w.findElement(By.xpath("//input[@placeholder='To']"));
	e1.sendKeys("Bangalore");
   w.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]")).click();
   w.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
  WebElement e2= w.findElement(By.xpath("//div[@aria-label='Mon Nov 15 2024']"));
  e2.click() ;
  w.findElement(By.xpath("//span[contains(text(),'RETURN')]")).click();
  WebElement e3= w.findElement(By.xpath("//div[@aria-label='Sun Nov 9 2024']"));
  e3.click();
  w.findElement(By.xpath("//span[contains(text(),'Travellers & CLASS')]")).click();
  w.findElement(By.xpath("//li[@data-cy='adults-2']")).click();
  w.findElement(By.xpath("//li[@data-cy='children-1']")).click();
  w.findElement(By.xpath("//li[@data-cy='infants-1']")).click();
  w.findElement(By.xpath("//li[@data-cy='travelClass-0']")).click(); 
  w.findElement(By.xpath("//button[text()='APPLY']")).click();
  w.findElement(By.xpath("//a[text()='Search']")).click();
  w.close();
	
}
}
