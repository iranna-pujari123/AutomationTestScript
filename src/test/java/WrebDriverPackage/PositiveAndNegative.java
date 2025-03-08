package WrebDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PositiveAndNegative {
	WebDriver driver;
	
	@BeforeMethod
	void setUp()
	{
		driver= new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@AfterMethod
	void tearDown()
	{
		driver.quit();
	}

	@Test
	void TestValidCredetial()
	{
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/logged-in-successfully/");
	}
	@Test
	void testSpecialSymbol()
	{
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("@#$#%%");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("#&$%$");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		String ErrorTest=driver.findElement(By.xpath("//*[@id=\"error\"]")).getText();
		Assert.assertEquals(ErrorTest, "Username and Password cant accept Any special Symbols");
	}
	@Test
	void testBlank()
	{
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		String ErrorTest=driver.findElement(By.xpath("//*[@id=\"error\"]")).getText();
		Assert.assertEquals(ErrorTest, "Enter Username and password ");
	}
	
	@Test
	void testAlpaNumeric()
	{
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("abc324gdb ");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("25gdb765");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		String ErrorTest=driver.findElement(By.xpath("//*[@id=\"error\"]")).getText();
		Assert.assertEquals(ErrorTest, "Alphanumric Input is Not Allowed !");
	}
	@Test
	void negativeCredetail()
	{
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("ABC@123");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123ABC@");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		String ErrorTest=driver.findElement(By.xpath("//*[@id=\"error\"]")).getText();
		Assert.assertEquals(ErrorTest, "Invalid Credetail Not Allows");
		
	}
}
