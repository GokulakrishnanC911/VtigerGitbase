package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {
	@Test
public void m1()
{
	System.out.println("step1");
	System.out.println("step2");
	Assert.assertEquals(false,true);
	System.out.println("step3");
	System.out.println("step4");
}
	@Test
	public void m2()
	{
		String expdata = "Qspider";
	    String actdata = "Qspider";
	    Assert.assertEquals(actdata, expdata);
	}
	@Test
	public void m3()
	{
		int a=10;
		int b=10;
		Assert.assertEquals(a, b, "Not Equal = ");
		System.out.println("It is Equal");
	}
	@Test(enabled=false)
	public void m4()
	{
		int a=10;
		int b=1;
		Assert.assertNotEquals(a, b, "It is Equal");
		System.out.println("It is not Equal");
	}
	@Test
	public void m5()
	{
		String s1="Hello";
		String s2="Hello";
		Assert.assertTrue(s1.equalsIgnoreCase(s2),"False");
		System.out.println("True");
	}
	@Test
	public void m6()
	{
		String s1="Hello";
		String s2="Hello";
		Assert.assertFalse(s1.equalsIgnoreCase(s2),"True");
		System.out.println("False");
	}
	@Test
	public void m7()
	{
		String s=null;
		Assert.assertNull(s, "it is not Null");
		System.out.println("it is Null");
	}
	@Test
	public void m8()
	{
		String s="Hello";
		Assert.assertNull(s, "it is not Null");
		System.out.println("it is Null");
	}
	@Test
	public void m9()
	{
		String s="hello";
		Assert.assertNotNull(s, "it is  Null");
		System.out.println("it is not null");
	}
	@Test
	public void m10()
	{
		String s="hell";
		String s1="hello";
		Assert.assertSame(s, s1, "not same");
		System.out.println("it is same");
	}
	@Test
	public void m11()
	{
		String s="hell";
		String s1="hello";
		Assert.assertNotSame(s, s1, " same");
		System.out.println("it is not same");
	}
	@Test
	public void m12()
	{
		Assert.fail("Im failing the TestSCript");
	}
}
