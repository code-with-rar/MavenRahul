package rahulTests;


	


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import rahulPages.FacebookSignUpPage;



public class BaseTest {
	 WebDriver driver;
	FacebookSignUpPage fsp;
	
	
	@BeforeSuite
	public void openbrowser() 
	{
//		System.setProperty("webdriver.chrome.driver", "E:\\A My Automation\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/signup/");	
	}
	
	@BeforeClass
	public void objectCreations() 
	{
		fsp=new FacebookSignUpPage(driver);
	}
	
	
	@AfterSuite
	public void closeBrowser() 
	{
//		driver.quit();
//		driver.close();
	}
	                                                  
}