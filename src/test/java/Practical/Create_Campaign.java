package Practical;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Generic_Uilities.BaseClass;
import Generic_Uilities.ExcelUtility;
import Generic_Uilities.FileUtility;
import Generic_Uilities.JavaUtilities;
import Generic_Uilities.WebDriverUtility;
import ObjectRepo.CampDetailedPage;
import ObjectRepo.CampValidatePage;
import ObjectRepo.CreateCampPage;
import ObjectRepo.LoginVtigerPage;
import ObjectRepo.VtigerHomePage;
@Listeners(Generic_Uilities.Listener.class)
public class Create_Campaign extends BaseClass {
	@Test//(retryAnalyzer = Generic_Uilities.Retry.class)
    public void Campaign_Create() throws Throwable {
        JavaUtilities ju = new JavaUtilities();
        ExcelUtility eu = new ExcelUtility();
        FileUtility fu = new FileUtility();
        String s = fu.getKeyAndValuePair("Browser");
        String s1 = fu.getKeyAndValuePair("Url");
        String s2 = fu.getKeyAndValuePair("Username");
        String s3 = fu.getKeyAndValuePair("Password");
        w.get(s1);
        
        LoginVtigerPage l = new LoginVtigerPage(w);
        l.LoginIntoVtigerPage(s2, s3);

        VtigerHomePage h = new VtigerHomePage(w);
        h.clickMoreLink();
        h.clickCampLink();
      
        CampDetailedPage img = new CampDetailedPage(w);
        img.clickCampLookUpImg();

        int rn = ju.getRandomNum();
        String e = eu.readExcelData("Campaigns", 0, 0) + rn;

        CreateCampPage cp = new CreateCampPage(w);
        cp.enterCampName(e);
        cp.clickSaveButton();
        Assert.fail();

        CampValidatePage cv = new CampValidatePage(w);
        String ad = cv.validateCampaign(w, e);
//        Assert.assertEquals(ad, e);

        System.out.println("Campaign page is created");

        h.logoutApp();
	    //pull back
    }
}
