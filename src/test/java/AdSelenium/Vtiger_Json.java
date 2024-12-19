package AdSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Vtiger_Json {
public static void main(String[] args) throws Throwable {		
File f= new File("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\JSonData.json");
ObjectMapper o=new ObjectMapper();
JsonNode d = o.readTree(f);
{
String s = d.get("browser").asText();
String s1 = d.get("url").asText();
String s2 = d.get("username").asText();
String s3 = d.get("password").asText();
WebDriver w ;
{
if (s.equalsIgnoreCase("chrome"))
{
	w = new ChromeDriver();
} 
else if (s.equalsIgnoreCase("firefox"))
{
	w = new FirefoxDriver();
} else if (s.equalsIgnoreCase("edge")) 
{
	w = new EdgeDriver();
} 
else
{
	w = new ChromeDriver();
}
w.get(s1);
w.findElement(By.name("user_name")).sendKeys(s2);
w.findElement(By.name("user_password")).sendKeys(s3);
w.findElement(By.id("submitButton")).click();
}
}
} 
}


