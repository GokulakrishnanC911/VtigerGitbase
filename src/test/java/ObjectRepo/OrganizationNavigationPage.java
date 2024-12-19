package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationNavigationPage {
	public OrganizationNavigationPage(WebDriver w)
	{
		PageFactory.initElements(w, this);
	}

	@FindBy(css = "[alt=\"Create Organization...\"]")
	private WebElement orgPlusSign;

	public WebElement getOrgPlusSign() 
	{
		return orgPlusSign;
	}

	public void clickOrgnization() 
	{
		orgPlusSign.click();
	}


}
