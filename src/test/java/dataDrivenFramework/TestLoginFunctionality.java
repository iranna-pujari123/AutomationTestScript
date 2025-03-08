package dataDrivenFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLoginFunctionality {
	
	@Test(dataProvider="td")
	void validattestData(String uname,String pass, String ExpectedResult)
	{
		System.out.println(uname + " "+ pass+" "+ExpectedResult );
		
		
	}
	
	
	
	
	
	@DataProvider(name="td")
	String[][] tData() throws Exception
	{
		String exceltestdata[][]=Exceldata.excelTestData();
		return exceltestdata;
	}

}
