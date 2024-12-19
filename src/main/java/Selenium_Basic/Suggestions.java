package Selenium_Basic;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Suggestions {
 public static void main(String[] args) throws InterruptedException 
 {
 WebDriver w=new ChromeDriver();
 w.get("https://www.google.com/");
 w.findElement(By.id("APjFqb")).sendKeys("Selenium");
 Thread.sleep(2000);
 List<WebElement>l=w.findElements(By.xpath("//ul[@class='G43f7e']/li"));
 int s=l.size();
 System.out.println(s);
 Thread.sleep(2000);
 if(s>1)
 {
	 WebElement e=l.get(1);
	 e.click();
	 Thread.sleep(2000); 
	 String s1= w.getTitle();
	 System.out.println("Page title after selecting suggestion: " +s1);
  }
 else
 {
	 System.out.println("No suggestions found.");
 
 }
 w.close();
}
}
