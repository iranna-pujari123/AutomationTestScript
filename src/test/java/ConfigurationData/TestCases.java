package ConfigurationData;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {
	@Test
	void validateTestcase() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Mynt")).click();
//		Thread.sleep(3000);
//		List<WebElement> ele = driver.findElements(By.xpath(
//				"//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[3]/footer/div/div[3]/div[1]//a"));
//
//		System.out.println(ele.size());
//
//		for (WebElement el : ele) {
//			String text = el.getText();
//			System.out.println(el.getText());
//
//			if (text.equals("Myntra") || text.equals("ceares")) {
//				el.click();
//				
//				
//			}
//		}
		
		
		
		
//		List<WebElement> ele=driver.findElements(By.xpath("//*[@id=\"form\"]/div/input"));
//		
//		for(WebElement el: ele)
//		{
//			String atr=el.getAttribute("id");
//			System.out.println(atr);
//			
//			if(atr.equals("email")) 
//			{
//				el.sendKeys("kiran@gmail.com");
//			}else if(atr.equals("password"))
//			{
//				el.sendKeys("123456");
//			}
//			
			
	//	}
		
		
		//Locators 
		// xpath , id , name, classname , LinkText, PartialLinkText, tagname, CssSelectors 
		
		// relative xpath
		// Absolute xpath 
		
//		driver.findElement(By.id("email")).sendKeys("Abc@123");
//		driver.findElement(By.id("password")).sendKeys("123456");
//		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		
	
			
		}



}
