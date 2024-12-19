package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CampValidatePage {
	public CampValidatePage(WebDriver w)
	{
		PageFactory.initElements(w, this);
	}

	public String validateCampaign(WebDriver w,String CampName)
	{
		
		String ad = w.findElement(By.id("dtlview_Campaign Name")).getText();
//
//		if (ad.contains(CampName)) 
//		{
//			System.out.println("Campaign Name is Created");
//		} 
//		else
//		{
//			System.out.println("Campaign Name is not Created");
//		}
		return ad;

	}
}
