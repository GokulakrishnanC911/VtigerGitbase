package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProductName {
	public DeleteProductName(WebDriver w)
	{
		PageFactory.initElements(w, this);
	}
	@FindBy(xpath = "//input[@value=\"Delete\"]")
	private WebElement DeleteButton;
	
	public void selectProdName(WebDriver w,String e)
	{
		w.findElement(By.xpath("//table[@class='lvt small']//a[text()='" + e
				+ "']/../preceding-sibling::td//input[@type='checkbox']")).click();
	}
	
	public void selectDeletButton()
	{
		DeleteButton.click();
	}
	public void validatePrdDeleted(WebDriver w,String e)
	{
		WebElement prd = w.findElement(By.xpath("//table[@class='lvt small']//a[text()='" + e + "']"));
		if (prd.equals(e))
		{
			System.out.println("Product Name is Present");
		}  
		else 
		{
			System.out.println("Product name is not Present");
		}
	}

}
