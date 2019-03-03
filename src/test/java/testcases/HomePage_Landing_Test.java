package testcases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.LandingPage_PF;
import java.io.IOException;

import resources.Setup;

public class HomePage_Landing_Test extends Setup {
	
	@Test
	public void NavigateToHomePage() throws IOException {
		
		//initialize
		LandingPage_PF landing = new LandingPage_PF(driver);
		String getLoginText =  landing.getLogin().getText();
		String getPageText =  landing.getElement().getText();
		
		//Assertions
		landing.getHomeLogo().click();
		Log.info("Home Logo Button from Home Page is clicked");
		
		Assert.assertEquals("Log In/Join", getLoginText);
		Log.debug("Expecting: [Log In/Join] BUT Actual: " + getLoginText);
		
		Assert.assertEquals("JUMP. RUN. HIDE.", getPageText);
		Log.debug("Expecting: [JUMP. RUN. HIDE.]  BUT Actual: " + getPageText);
		
	}

}
