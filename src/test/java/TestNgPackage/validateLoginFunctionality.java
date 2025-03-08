package TestNgPackage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class validateLoginFunctionality {
	ExtentSparkReporter sparkReporter;
	ExtentReports reports;
	 ExtentTest test;
	
	@BeforeClass
	void setUp()
	{
	 sparkReporter= new ExtentSparkReporter("C:\\Users\\JBK\\Desktop\\719 TNS batch\\Simple_Maven_Peoject\\extentReport\\Newreport.html");
	 sparkReporter.config().setTheme(Theme.DARK);
	 sparkReporter.config().setDocumentTitle("Automation Testing ");
	 sparkReporter.config().setReportName("Functional Testing");
	 
	 reports  = new ExtentReports();
	 
	 reports.setSystemInfo("Tester name ","Iranna Pujari")	;
	 reports.setSystemInfo("Browser","Chrome")	;
	 reports.setSystemInfo(" Enviornment","QA")	;
	 
	 reports.attachReporter(sparkReporter)
	 
;	 test= reports.createTest("Login Functionality Test Cases");
	 
		
	}
	@AfterClass
	void tearDown()
	{
		reports.flush();
		
	}
	@Test
	void testValidCredetial()
	{
		Assert.assertTrue(true);
		test.pass("test case pass");
	}
	
	@Test
	void testInValidCredetial()
	{
		Assert.assertTrue(false);
		test.log(Status.FAIL, "Test cases Fail");
	}
	@Test
	void testHeader()
	{
		Assert.assertEquals(3, 4);
		test.log(Status.FAIL, "Test case fail ");
	}

}
