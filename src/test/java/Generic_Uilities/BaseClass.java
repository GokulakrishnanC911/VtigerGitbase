package Generic_Uilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import ObjectRepo.LoginVtigerPage;
import ObjectRepo.VtigerHomePage;

public class BaseClass {
	 public WebDriver w;
		public static WebDriver sw;
		@BeforeSuite
		public void bs()
		{
			System.out.println("DataBase connection");
		}

		@BeforeTest
		public void bt()
		{
			System.out.println("parallel execution");
		}
		@Parameters("BROWSER")
		@BeforeClass//(groups = {"smoke","Regression","sanity"})
		public void bc() throws Throwable 
		{
			FileUtility fu = new FileUtility();
			String s= fu.getKeyAndValuePair("Browser");
//		public void bc(String s ) throws Throwable
//		{
			if (s.equalsIgnoreCase("chrome")) 
			{
				w = new ChromeDriver();
			} 
			else if (s.equalsIgnoreCase("firefox")) 
			{
				w = new FirefoxDriver();
			} 
			else if (s.equalsIgnoreCase("edge"))
			{
				w = new EdgeDriver();
			}
			else 
			{
				w = new ChromeDriver();
			}
			System.out.println("launching browser");
			sw=w;
		}
		//@Parameters({"URL","USERNAME","PASSWORD"})
		@BeforeMethod//(groups = {"smoke","Regression","sanity"})
		public void bm() throws Throwable 
		{
			System.out.println("login to application");
//		public void bm(String s,String s1,String s2) throws Throwable 
//		{
//			w.get(s);
//			LoginVtigerPage l = new LoginVtigerPage(w);
//			l.LoginIntoVtigerPage(s1, s2);
//			WebDriverUtility wu = new WebDriverUtility();
//			wu.Maximize(w);
//			wu.waitForPageLoad(w);
		}

		@AfterMethod//(groups = {"smoke","Regression","sanity"})
		public void am()
		{
//			VtigerHomePage h= new VtigerHomePage(w);
//			h.logoutApp();
			System.out.println("logout from Application");
		}

		@AfterClass//(groups = {"smoke","Regression","sanity"})
		public void ac() 
		{
//			w.quit();
			System.out.println("close the browser");
		}

		@AfterTest//(groups = {"smoke","Regression","sanity"})
		public void at()
        {
			System.out.println("close parallel execution");
		}

		@AfterSuite//(groups = {"smoke","Regression","sanity"})
		public void as()
		{
			System.out.println("Data base close");
		}
}
