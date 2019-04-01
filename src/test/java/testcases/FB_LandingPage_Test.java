package testcases;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.FB_LandingPage;
import java.io.IOException;

import resources.Setup;

public class FB_LandingPage_Test extends Setup {
	
	@Test
	public void Login() throws IOException {
		
		//initialize
		FB_LandingPage landing = new FB_LandingPage(driver);
		driver.get("https://www.facebook.com/");
		Log.info("Opening Page: " + driver.getTitle());
		
		//globals
		String pageHeader1 =  landing.pageHeader1().getText();
		String pageHeader2 =  landing.pageHeader2().getText();
		String pageHeader3 =  landing.pageHeader3().getText();
		WebElement inputEmail = landing.getEmail();
		WebElement inputPassword = landing.getPassword();
		WebElement clickLogin = landing.getSubmit();
		WebElement clickLogo = landing.getLogo();
	
		
		//Assertions
		Assert.assertEquals("See photos and updates", pageHeader1);
		Log.info("Expecting: [See photos and updates] BUT Actual: " + pageHeader1);
		
		Assert.assertEquals("Some Random Text", pageHeader2);
		Log.info("Expecting: [Share what's new]  BUT Actual: " + pageHeader2);
		
		Assert.assertEquals("Find more", pageHeader3);
		Log.info("Expecting: [Find more]  BUT Actual: " + pageHeader3);
		
		
		//Actions
		//submit login form
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
		
		//submit login form
		clickLogin.click();
		Log.info("Login Button clicked");
			
		
		
	}

}
