package rahulTests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookSignupTest extends BaseTest {
	
	@Test
	public void enterCredintialValidate() 
	{
		
		
		fsp.entercredintitial();
	}
	
	@Test
	public void titleValidate() 
	{
		
		String actual = fsp.getTitle();
		
		String expected="Sign up for Facebook | Facebook";
		
		boolean isPresent = actual.contains(expected);
		System.out.println(isPresent);
		Assert.assertTrue(isPresent);
	}

}