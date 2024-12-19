package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerHomePage {
	public VtigerHomePage(WebDriver w) 
	{
		PageFactory.initElements(w, this);
	}
	@FindBy(linkText="More")
	private WebElement morelink;
	@FindBy(linkText="Campaigns")
	private WebElement Campaignslink;
	@FindBy(xpath = "//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement admLink;
	@FindBy(linkText = "Sign Out")
	private WebElement signOut;
	public WebElement getMorelink()
	{
		return morelink;
	}
	public WebElement getCampaignslink()
	{
		return Campaignslink;
	}
	public WebElement getAdmLink()
	{
		return admLink;
	}
	public WebElement getSignOut()
	{
		return signOut;
	}
	public void clickMoreLink() 
	{
		morelink.click();
	}
	public void clickCampLink()
	{

		Campaignslink.click();
	}
	public void logoutApp()
	{
	admLink.click();
    signOut.click();
	}
}
