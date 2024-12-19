package Selenium_Basic;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script {
@Test
public void CreateAccount()
{
	Reporter.log("Create Account",true);
}
@Test
public void EditAccount()
{
	Reporter.log("Edit Account",true);
}
@Test
public void DeleteAccount()
{
	Reporter.log("Delete Account",true);
}
}
