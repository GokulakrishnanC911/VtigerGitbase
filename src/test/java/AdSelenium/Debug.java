package AdSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
public static void main(String[] args) 
{
	WebDriver w= new ChromeDriver();
	w.get("https://www.flipkart.com/");
	w.manage().window().maximize();
}
}
