package testcases;
import org.testng.annotations.Test;

import pageobjects.LandingPage_PF;
import pageobjects.SignUpPage_Login_PF;
import pageobjects.SignUpPage_Main_PF;

import java.io.IOException;
import org.testng.annotations.DataProvider;

import resources.Setup;

public class SignUpPage_Login_Test extends Setup {
	
	@Test(dataProvider = "getData")
	public void LoginToAccount(String url, String email, String password) throws IOException {
	
		//initialize
		LandingPage_PF login_main = new LandingPage_PF(driver);
		SignUpPage_Main_PF signup = new SignUpPage_Main_PF(driver);
		SignUpPage_Login_PF email_text = new SignUpPage_Login_PF(driver);
		
		//begin test
		login_main.getLogin().click();
		Log.info("Login Button from Home Page is clicked");
		
		signup.getLogin().click();
		Log.info("Login Button from Login page is clicked");
		
		email_text.getEmail().click();
		Log.info("Email textbox is clicked");
		
		email_text.getEmail().sendKeys(email);
		Log.info("email: " + email + " is sent");
		
		email_text.getPassword().click();
		Log.info("Login Button is displayed");
		
		email_text.getPassword().sendKeys(password);
		Log.info("password: " + password + " is sent");
		
		email_text.getSubmit().click();
		Log.info("Submit Button is clicked");
	}
	
	//login using two users. First case is invalid, second case is valid.
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];
		
		//first test invalid login
		data[0][0] = "https://www.superleague.com";
		data[0][1] = "failedtest@gmail.com";
		data[0][2] = "12345678";
		
		//second test valid login
		data[1][0] = "https://www.superleague.com";
		data[1][1] = "buffboyali@gmail.com";
		data[1][2] = "messenger";	
		
		return data;
	}
	
}
