package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Setup;

public class SignUpPage_Main_PF extends Setup{
	
	//initialize driver;
	public SignUpPage_Main_PF(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Setup.driver = driver;
	}
	
	//Page Objects
	@FindBy(linkText = "Sign Up")
	 WebElement signup;
	
	@FindBy(linkText = "Login")
	 WebElement login;
	
	
	@FindBy(className= "icon-login-logo")
	 WebElement logo;
	
	//Get Objects
	public WebElement getSignUp() {
		return signup;
	}
	
	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getLogo() {
		return logo;
	}
	

}
