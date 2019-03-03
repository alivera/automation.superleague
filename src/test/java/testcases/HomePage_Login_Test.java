package testcases;
import org.testng.annotations.Test;
import pageobjects.LandingPage_PF;
import pageobjects.SignUpPage_Main_PF;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.io.IOException;

import resources.Setup;

public class HomePage_Login_Test extends Setup {
	
	@Test
	public void NavigateToLoginPage() throws IOException {
		
		LandingPage_PF login = new LandingPage_PF(driver);
		SignUpPage_Main_PF signup = new SignUpPage_Main_PF(driver);
		login.getLogin().click();
	
		//assertions
		Assert.assertTrue(signup.getLogin().isDisplayed());
		Log.info("Login Button is displayed");
		
		AssertJUnit.assertTrue(signup.getSignUp().isDisplayed());
		Log.info("SignUp Button is displayed");
		
		Assert.assertTrue(signup.getLogo().isDisplayed());
		Log.info("Logo is displayed");
	}
	
}
