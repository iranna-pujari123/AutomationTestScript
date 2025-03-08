package TestNgPackage;

import org.testng.annotations.Test;

public class TestNGTest {
	@Test(groups="smoke")
	void test1()
	{
		System.out.println("Smoke test cases");
	}
	@Test(groups="sanity")
	void test2()
	{
		System.out.println("sanity test cases");
	}
	@Test(groups="sanity")
	void test3()
	{
		System.out.println("Smoke test cases");
	}



}
