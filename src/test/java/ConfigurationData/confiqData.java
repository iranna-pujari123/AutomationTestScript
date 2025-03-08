package ConfigurationData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class confiqData {
	@Test
	void confiqData() throws Exception
	{
		WebDriver driver;
		FileInputStream file= new FileInputStream("C:\\Users\\JBK\\Desktop\\719 TNS batch\\Simple_Maven_Peoject\\config.properties");
		Properties pro= new Properties();
		pro.load(file);
		String OpenBrowser=pro.getProperty("browser");
		
		System.out.println(OpenBrowser);
		String URL=pro.getProperty("baseUrl");
		System.out.println(URL);
		String anotherrusername =pro.getProperty("Username1");
		
		System.out.println(anotherrusername);
		
		String username =pro.getProperty("Username");
		
		
		String password =pro.getProperty("Password");
		
		if(OpenBrowser.equalsIgnoreCase("chrome"))
		{
			 driver = new ChromeDriver();
		}else if(OpenBrowser.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}else if(OpenBrowser.equalsIgnoreCase("IE"))
		{
			driver= new InternetExplorerDriver();
		}
		else      ///   3     3
		{
			 driver = new ChromeDriver();
		}
		
		driver.get(URL);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		
	}

}
