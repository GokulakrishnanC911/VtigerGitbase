package Selenium_Basic;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

     public class Text {
	  public static void main(String[] args) throws InterruptedException 
	  {
	        WebDriver w = new ChromeDriver();
	        w.get("https://www.google.com/");
	        Thread.sleep(2000);
	        List<WebElement> l = w.findElements(By.xpath("//a"));
	       int s=l.size();
	       System.out.println("total no.of Links =  "+s);
	       Thread.sleep(2000);
	       for(int i=0;i<s;i++)
	       {
	    	   WebElement e=l.get(i);
	    	   String s1=e.getText();
	    	   Thread.sleep(2000);
	    	   System.out.println(s1);
	       }
	       w.close();
} 
}
