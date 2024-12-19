package TestNG;

import org.testng.annotations.Test;


public class TestScript1 {
	@Test
public void CreateProduct()
{
	System.out.println("Create the Product");
}
	@Test(invocationCount=3)
public void ModifyProduct()
{
	System.out.println("Modify the Product");
}
	@Test
public void DeleteProduct()
{
	System.out.println(" Delete the Product");
}
}
