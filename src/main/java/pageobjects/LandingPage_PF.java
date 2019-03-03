package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Setup;

public class LandingPage_PF extends Setup{
	
	//initialize driver;
	public LandingPage_PF(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Setup.driver = driver;
	}
	
	//Page Objects
	@FindBy(linkText = "Log In/Join")
	 WebElement login;

	@FindBy(xpath = "/html/body/div[20]/div/section[1]/div/div/div[1]/div/header/h1")
	 WebElement element;
	
	
	@FindBy(xpath = "/html/body/div[3]/header[2]/div/div[1]/a")
	 WebElement homeLogo;
	
	
	//Get Objects
	public WebElement getLogin() {
		return login;
	}
	
	
	public WebElement getElement() {
		return element;
	}
	
	
	public WebElement getHomeLogo() {
		return homeLogo;
	}
	

}
