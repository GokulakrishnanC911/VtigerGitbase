package Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook_login {
@FindBy(id="email")
private WebElement e;
@FindBy(id="pass")
private WebElement p;
@FindBy(name="login")
private WebElement l;

public FaceBook_login(WebDriver w)
{
	PageFactory.initElements(w, this);
}
public void login(String email,String pass)
{
	e.sendKeys(email);
	p.sendKeys(pass);
	l.click();
}
}
