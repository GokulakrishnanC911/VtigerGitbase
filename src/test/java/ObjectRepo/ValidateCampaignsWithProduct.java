package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ValidateCampaignsWithProduct {
	public ValidateCampaignsWithProduct(WebDriver w)
	{
		PageFactory.initElements(w, this);
	}
	
	public void validateCampName(WebDriver w,String CampName)
	{
		String ad = w.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();

		if (ad.contains(CampName))
		{
			System.out.println("Campaigns Name is Created");
		} 
		else 
		{
			System.out.println("Campaigns name not created");
		}
	}
	public void validatePrdName(WebDriver w,String Prdname)
	{
	String ad1 = w.findElement(By.xpath("//span[@id=\"dtlview_Product\"]")).getText();
	if (ad1.equals(Prdname)) 
	{
		System.out.println("Product Name is Created");
	} 
	else 
	{
		System.out.println("Product name is not created");
	}
	}

}
