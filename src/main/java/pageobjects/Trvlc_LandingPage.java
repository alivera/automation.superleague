package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Trvlc_LandingPage {
	
	//initialize driver;
	public Trvlc_LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Page Objects-------------
	
	//Destination input
	@FindBy(css= "#hotel-destination-hp-hotel")
	WebElement destination;
		
	//Dropdown #rooms
	@FindBy(css= "#hotel-rooms-hp-hotel")
	WebElement rooms;
	
	//Dropdown #adults
	@FindBy(css= "#hotel-1-adults-hp-hotel")
	WebElement adults;
	
	//Dropdown #children
	@FindBy(css= "#hotel-1-children-hp-hotel")
	WebElement children;
	
	//Dropdown #age
	@FindBy(css= "#hotel-1-age-select-1-hp-hotel")
	WebElement age;
	
	//submit button
	@FindBy(css= "#gcw-hotel-form-hp-hotel > div:nth-child(11) > label > button")
	WebElement submit;
	
	//Travelocity logo
	@FindBy(css= "#header-logo")
	WebElement logo;
	
	//Get Objects----------------
	
	public WebElement getDestination() {
		return destination;
	}
	
	public WebElement getNumRooms() {
		return rooms;
	}
	
	public WebElement getNumAdults() {
		return adults;
	}
	
	public WebElement getNumChildren() {
		return children;
	}
	
	public WebElement getAge() {
		return age;
	}
	
	public WebElement getSubmit() {
		return submit;
	}
	
	public WebElement getLogo() {
		return logo;
	}


}
