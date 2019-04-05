package testcases;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.Trvlc_LandingPage;
import java.io.IOException;
import resources.Setup;

public class Trvlc_LandingPage_Test extends Setup {
	
	@Test
	public void TripPlan() throws IOException {
		
		//initialize
		Trvlc_LandingPage landing = new Trvlc_LandingPage(driver);
		driver.get("https://www.travelocity.com");
		Log.info("Opening Page: " + driver.getTitle());
		
		//objects
		WebElement Inputdestination = landing.getDestination();
		WebElement selectNumRooms = landing.getNumRooms();
		WebElement selectNumAdults = landing.getNumAdults();
		WebElement selectNumChildren = landing.getNumChildren();
		WebElement selectAge = landing.getAge();
		WebElement submitButton = landing.getSubmit();
		WebElement logo = landing.getLogo();
		
		//check if logo is displayed
		if(logo.isDisplayed()) {
			Log.info("Logo is displayed!");
		} else {
			Log.info("Logo is not displayed!");
			
		}
		
		//assert the logo
		Assert.assertEquals(logo.isDisplayed(), true, "Logo is displayed");
		
		//inputed destination
		Inputdestination.sendKeys("LAX");
		Log.info("Destination Inputed");
		
		//select num Adults
		Select s_adults = new Select(selectNumAdults);
		s_adults.selectByValue("3"); 
		Log.info("Adults selected");
		
		//select num rooms
		Select s_rooms = new Select(selectNumRooms);
		s_rooms.selectByVisibleText("1"); 
		Log.info("Rooms selected");
		
		//select num children
		Select s_children = new Select(selectNumChildren);
		s_children.selectByIndex(1);
		Log.info("Children selected");
		
		//select num age
		Select s_age = new Select(selectAge);
		s_age.selectByIndex(4);
		Log.info("Children selected");
		
		//click submit
		submitButton.click();
		Log.info("Submit button is clicked");
	
	
		
	}
	


}
