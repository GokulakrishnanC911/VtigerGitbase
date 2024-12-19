package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ValidatePrdName {
	public ValidatePrdName(WebDriver w)
	{
		PageFactory.initElements(w, this);
	}
	
	public void validatePrd(WebDriver w,String e )
	{
		String ad = w.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();

		if (ad.equals(e)) 
		{
			System.out.println("Product Name is Created");
		} 
		else 
		{
			System.out.println("Product name is not created");
		}
	}

}
