package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ValidateOrganization {
	public ValidateOrganization(WebDriver w)
	{
		PageFactory.initElements(w, this);
	}
	public void validateOrgName(WebDriver w,String OrgName)
	{
		String ad = w.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();

		if (ad.contains(OrgName)) 
		{
			System.out.println("Organization Name is Created");
		} 
		else 
		{
			System.out.println("Organization name not created");
		}
	}

}
