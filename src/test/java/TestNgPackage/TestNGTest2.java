package TestNgPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTest2 {
	@Test(groups="sanity")
	void test4()
	{
		System.out.println("sanity test cases");
		Assert.assertEquals(3, 2);
	}
	@Test(groups="regression")
	void test5()
	{
		System.out.println("regression  test cases");
	}
	@Test(groups="regression")
	void test6()
	{
		System.out.println("regrerssion  test cases");
	}



}
