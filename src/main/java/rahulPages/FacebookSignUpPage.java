package rahulPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpPage {
	static WebDriver driver;
	@FindBy(xpath="//*[@name='firstname']") private	WebElement firstname;
	@FindBy(xpath="//*[@name='lastname']") WebElement lastname;
		
		public FacebookSignUpPage(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public void entercredintitial() 
		{
//			driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("RAHUL");
			firstname.sendKeys("RAHUL");
			
//			driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("RAJURKAR");
			lastname.sendKeys("RAJURKAR");
			
			driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("9876543210");
			driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("12345@12345");
			
			WebElement day = driver.findElement(By.xpath("//*[@name='birthday_day']"));

	        Select dsel= new Select(day);
	        dsel.selectByIndex(14);
	        
			WebElement month = driver.findElement(By.xpath("//*[@name='birthday_month']"));
			Select msel= new Select(month);
			msel.selectByValue("8");
			
			WebElement year = driver.findElement(By.xpath("//*[@name='birthday_year']"));
			Select ysel= new Select(year);
			ysel.selectByVisibleText("1999");
			
			driver.findElement(By.xpath("(//*[@name='sex'])[2]")).click();
			
			driver.findElement(By.xpath("//*[@name='websubmit']")).click();	
		}
		
		public String getTitle() 
		{
			String title = driver.getTitle();
			
			System.out.println(title);
			
			return title;
		}

	
	
	
}
