package testcases;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.FB_LandingPage;
import java.io.IOException;
import resources.Setup;

public class FB_LandingPage_Test extends Setup {
	
	@Test(dataProvider = "getData")
	public void Login(String username, String password, String actual, String expected, String message) throws IOException {
		
		//initialize
		FB_LandingPage landing = new FB_LandingPage(driver);
		Log.info("Opening Page: " + driver.getTitle());
		WebElement inputEmail = landing.getEmail();
		WebElement inputPassword = landing.getPassword();
		WebElement clickLogin = landing.getSubmit();
		WebElement clickLogo = landing.getLogo();
		
		//click the Facebook logo
		clickLogo.click();
		Log.info("Logo Button clicked");
		
		//input login email
		inputEmail.sendKeys(username);
		Log.info("usernamed  inputted: " + username);
		
		//input login email
		inputPassword.sendKeys(password);
		Log.info("password inputted: " + password);
		
		//Assertions
		Assert.assertEquals(actual, expected, message);
		Log.info("Actual: " + actual + " BUT Expecting: " + expected + message);
		
		//submit login form
		clickLogin.click();
		Log.info("Login Button clicked");
		
	}
	
	//Run 3 tests and check actual text vs expected text
	@DataProvider
	public Object[][] getData() {
		//initialize
		FB_LandingPage landing = new FB_LandingPage(driver);
		driver.get("https://www.facebook.com/");
		String actual1 = landing.GetPageHeader1().getText();
		String actual2 = landing.GetPageHeader2().getText();
		String actual3 = landing.GetPageHeader3().getText();
		return new Object[][] {
			{"username1@email.com", "password123", actual1, "See photos and updates", "Test1"},
			{"username2@email.com", "password123", actual2, "This test will fail", "Test2"},
			{"username3@email.com", "password123", actual3, "Find more", "Test3"}
		};
	}

}
