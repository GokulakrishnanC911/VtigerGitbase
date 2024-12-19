package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	@Test
public void m1()
{
	System.out.println("Step1");
	System.out.println("Step2");
	SoftAssert sf = new SoftAssert();
	sf.assertEquals(true, false);
	System.out.println("Step3");
	System.out.println("Step4");
	sf.assertAll();
}
}
