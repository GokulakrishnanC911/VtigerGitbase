package Selenium_Basic;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Yatra {
public static void main(String[] args) throws InterruptedException 
{
	WebDriver w= new ChromeDriver();
	w.get("https://www.yatra.com/");
	Thread.sleep(2000);
	w.findElement(By.xpath("//a[text()='My Account']")).click();
	Thread.sleep(2000);
	w.findElement(By.id("SignUpBtn")).click();
	Thread.sleep(2000);
	w.findElement(By.id("fb-login-btn")).click();
	Thread.sleep(2000);
	w.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	Set<String> s = w.getWindowHandles();
	Iterator<String> i = s.iterator();
	while (i.hasNext())
	{
		String r =i.next();
		w.switchTo().window(r);
		String s1=w.getTitle();
		System.out.println(s1);
	}
	w.quit();
	
}
}
