package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginVtigerPage {
	public LoginVtigerPage(WebDriver w)
	{
		PageFactory.initElements(w, this);
	}
		@FindBy(name="user_name")
		private WebElement un;
		@FindBy(name="user_password")
		private WebElement pwd;
		@FindBy(id="submitButton")
		private WebElement Login;
		
		public WebElement getUserTextField() 
		{
			return un;
		}
		public WebElement getUserpasswordField() 
		{
			return pwd;
		}
		public WebElement getUserLoginButton() 
		{
			return Login;
		}
		public void LoginIntoVtigerPage(String UserName,String password)
		{
		un.sendKeys(UserName);
		pwd.sendKeys(password);
		Login.click();
		
		}
}

