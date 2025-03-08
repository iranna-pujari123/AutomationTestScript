package WrebDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleScript {
	WebDriver driver;
	@BeforeMethod
	void setup()
	{
		       //open browser
				driver= new ChromeDriver();
			
				//open URL 
				driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@AfterMethod
	void tearDown()
	{
		driver.quit();
	}

	// validate login functionality with valid credential 
	
	//test Steps   open browser-->open URL->valid username-->valid password->click button 
	
//expected result ---> page should be navigate to the home page  URL 
// actual result -->page is navigate home page 
	@Test
	void testURL()
	{
		
		
		
		//pass valid username on username field
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		
		//pass valid password on password field
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		
		//click on button 
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		//validate
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/logged-in-successfully/");
		
	
	}
	@Test
	void testTitle()
	{
		
		
		//pass valid username on username field
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		
		//pass valid password on password field
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		
		//click on button 
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		//validate
		
		Assert.assertEquals(driver.getTitle(), "Welcome to the kiran Academy");
		
	}
	
	@Test
	void testText()
	{
				
				//pass valid username on username field
				driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
				
				//pass valid password on password field
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
				
				//click on button 
				driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
				
				String actual_Text=driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1")).getText();
				//validate
		
				Assert.assertEquals(actual_Text,"Logged In Successfully" );
	}
	
	
	

}
