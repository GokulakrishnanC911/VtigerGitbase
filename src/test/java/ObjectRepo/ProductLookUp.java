package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductLookUp {
	public ProductLookUp(WebDriver w) 
	{
		PageFactory.initElements(w, this);
	}
	@FindBy(xpath = "//img[@title=\"Create Product...\"]")
	private WebElement prdPlusSign;

	public WebElement getPrdPlusSign()
	{
		return prdPlusSign;
	}

	public void clickOnPlusSign() 
	{
		prdPlusSign.click();
	}

}
