package Generic_Uilities;

import java.util.Date;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ExtentReport implements ITestListener {
	ExtentReports report;
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result)
   {
		test= report.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		test.log(Status.PASS, result.getMethod().getMethodName());
		test.log(Status.PASS, result.getThrowable());
		System.out.println("Script Pass");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
String testName = result.getMethod().getMethodName();
		
		test.log(Status.FAIL, testName + "Failed");
		test.log(Status.FAIL, result.getMethod().getMethodName());
		test.log(Status.FAIL, result.getThrowable());
		System.out.println("Script fail");
		String screenshot=null;
		try 
		{
			screenshot = WebDriverUtility.takeScreenShot(BaseClass.sw, result.getMethod().getMethodName());

		} 
		catch (Throwable e)
		{

			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(screenshot);
	}

	@Override
	public void onTestSkipped(ITestResult result)
    {
		test.log(Status.SKIP, result.getMethod().getMethodName());
		test.log(Status.SKIP, result.getThrowable());
		System.out.println("Script SKIP");	
	}

	@Override
	public void onStart(ITestContext context) 
	{
		String time = new Date().toString().replace(" ", "_").replace(":", "_");
//		JavaUtilities ju = new JavaUtilities();
//		int rn = ju.getRandomNum();
		
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReportGen/Report.html"+time);
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("VtigerReport");
		spark.config().setReportName("Gokul");
		
		report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("platform", "windows");
		report.setSystemInfo("executedBy", "Gokul");
		report.setSystemInfo("reviewedby", "Priya");
	}

	@Override
	public void onFinish(ITestContext context)
	{
		report.flush();	
	}

}
