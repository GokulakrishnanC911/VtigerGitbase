package Generic_Uilities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener  implements ITestListener {

		@Override
		public void onTestFailure(ITestResult result)
		{
			        TakesScreenshot takesScreenShot = (TakesScreenshot) BaseClass.sw;
			        File src = takesScreenShot.getScreenshotAs(OutputType.FILE);
			        File dst = new File("./ScreenShots.png");
			        try 
			        {
			            FileUtils.copyFile(src, dst);
			        } 
			        catch (IOException e) 
			        {
			           
			            e.printStackTrace();
			        }
			    }
		}

