package Selenium_Basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_ScreenShot {
public static void main(String[] args) throws IOException
{
	WebDriver w= new ChromeDriver();
	w.get("https://www.facebook.com/");
	TakesScreenshot s= (TakesScreenshot)w;
	File src=s.getScreenshotAs(OutputType.FILE);
	File d= new File("../Selenium_Basic/Screenshot/FB.png");
	FileUtils.copyFile(src, d);
	w.close();
}
}
