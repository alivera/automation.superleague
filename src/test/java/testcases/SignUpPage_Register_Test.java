package testcases;
import org.testng.annotations.Test;

import pageobjects.LandingPage_PF;
import pageobjects.SignUpPage_Main_PF;

import java.io.IOException;

import resources.Setup;

public class SignUpPage_Register_Test extends Setup {
	
	@Test
	public void NavigatetoRegistrationPage() throws IOException {
		
		//initialize
		LandingPage_PF login = new LandingPage_PF(driver);
		SignUpPage_Main_PF signup = new SignUpPage_Main_PF(driver);
		
		login.getLogin().click();
		Log.info("Login Button from home page is clicked");
		
		signup.getSignUp().click();	
		Log.info("SignUp button from login page is clicked");
			
	}
	
}
