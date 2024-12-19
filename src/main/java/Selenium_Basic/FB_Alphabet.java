package Selenium_Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//WATS to display all the options text as an output in Alphabetical order in FB Month field 
public class FB_Alphabet {
public static void main(String[] args) 
{
	WebDriver w= new ChromeDriver();
	w.get("https://www.facebook.com/");
	w.findElement(By.linkText("Create new account")).click();
	WebElement m=w.findElement(By.id("month"));
	Select s= new Select(m);
	List<WebElement> l = s.getOptions();
	List<String> mn= new ArrayList<>();
//	List<String> mn= new ArrayList<String>();
    
    for (int i = 0; i < l.size(); i++) 
    {
        WebElement e = l.get(i);
        mn.add(e.getText());
    }
    Collections.sort(mn);
    for (String month : mn) 
//      for(int i=0; i<mn.size(); i++)
    	{
        System.out.println(month);
//      System.out.println(mn.get(i));
    }
    w.close();
}
}

