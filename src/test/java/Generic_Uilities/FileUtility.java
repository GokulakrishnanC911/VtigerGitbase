package Generic_Uilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
public String getKeyAndValuePair(String Key) throws Throwable
{
	FileInputStream f = new FileInputStream("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\Property.properties");
	Properties p = new Properties();
	p.load(f);
	String s = p.getProperty(Key);
	return s;
	
}
}
