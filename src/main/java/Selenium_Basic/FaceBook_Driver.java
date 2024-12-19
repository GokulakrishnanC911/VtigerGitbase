package Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Driver {
	public static void main(String[] args) 
	{
		WebDriver w= new ChromeDriver();
		w.get("https://www.facebook.com/");
		FaceBook_login f= new FaceBook_login(w);
		f.login("abc@gmail.com","1234");
		w.close();
	}

}
