package testcases;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.FB_LandingPage;
import java.io.IOException;

import resources.Setup;

public class FB_LandingPage_Test extends Setup {
	
	//globals
	public String actual1;
	public String actual2;
	public String actual3;
	public String expected1;
	public String expected2;
	public String expected3;
	
	@Test(dataProvider = "getData")
	public void Login(String url, String actual, String expected) throws IOException {
		
		//initialize
		FB_LandingPage landing = new FB_LandingPage(driver);
		driver.get(url);
		Log.info("Opening Page: " + driver.getTitle());
		
		//declare vars
		actual1 =  landing.pageHeader1().getText();
		actual2 =  landing.pageHeader2().getText();
		actual3 =  landing.pageHeader3().getText();
		expected1 = "See photos and updates";
		expected2 = "Share what's new";
		expected3 = "Find more";
		WebElement inputEmail = landing.getEmail();
		WebElement inputPassword = landing.getPassword();
		WebElement clickLogin = landing.getSubmit();
		WebElement clickLogo = landing.getLogo();
		
		//click the Facebook logo
		clickLogo.click();
		Log.info("Logo Button clicked");
		
		//input login email
		inputEmail.click();
		inputEmail.sendKeys("username@email.com");
		Log.info("usernamed  inputted");
		
		//input login email
		inputPassword.click();
		inputPassword.sendKeys("password");
		Log.info("password inputted");
		
		//Assertions
		Assert.assertEquals(actual, expected);
		Log.info("Actual: " + actual + "BUT Expecting: " + expected);
		
		//submit login form
		clickLogin.click();
		Log.info("Login Button clicked");
		
	}
	
	//Run 3 tests and check actual text vs expected text
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {
			{"https://www.facebook.com/", actual1, expected1},
			{"https://www.facebook.com/", actual1, expected2},
			{"https://www.facebook.com/", actual1, expected3}
		};
	}

}
