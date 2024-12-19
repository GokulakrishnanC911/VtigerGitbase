package Generic_Uilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebDriverUtility {
public void Maximize(WebDriver w)
{
	w.manage().window().maximize();
}
public void waitForPageLoad(WebDriver w)
{
	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
public void windowSwtiching(WebDriver w, String ParitalTitle)
{
	Set<String> aw = w.getWindowHandles();
	Iterator<String> it = aw.iterator();

	while (it.hasNext()) 
	{
		String win = it.next();
		w.switchTo().window(win);
		String str = w.getTitle();
		if (str.contains(ParitalTitle))

		{
			break;
		}	
}
}
public void alertAccept(WebDriver w)
{
	w.switchTo().alert().accept();
}

public void screenShot() 
  {
	TakesScreenshot ts = (TakesScreenshot) BaseClass.sw;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst = new File("./ScreenShots/image.png");
	try 
	{
		FileUtils.copyFile(src, dst);
	}
	catch (IOException e) 
	{
		
		e.printStackTrace();
	}
}

public static String takeScreenShot(WebDriver w, String screenShotName) throws Throwable 
{
	TakesScreenshot tss= (TakesScreenshot) w;
	File src = tss.getScreenshotAs(OutputType.FILE);
	File dst = new File("./ScreenShot/" + screenShotName +".png");
	FileUtils.copyFile(src, dst);
	return dst.getAbsolutePath();
}
}
