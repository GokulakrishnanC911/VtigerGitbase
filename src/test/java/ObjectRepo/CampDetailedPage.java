package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampDetailedPage {
	public CampDetailedPage(WebDriver w)
	{
		PageFactory.initElements(w, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Campaign...']")
	private WebElement lookUpImg;
	public WebElement getLookUpImg() 
	{
		return lookUpImg;
	}
	public void clickCampLookUpImg()
	{
		lookUpImg.click();
	}
}
