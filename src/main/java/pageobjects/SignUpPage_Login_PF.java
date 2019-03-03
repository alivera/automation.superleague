package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Setup;

public class SignUpPage_Login_PF extends Setup{
	
	//initialize driver;
	public SignUpPage_Login_PF(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Setup.driver = driver;
	}
	
	//Page Objects
	@FindBy(id = "input_14_1")
	 WebElement email;
	
	@FindBy(id = "input_14_3")
	 WebElement password;
	
	@FindBy(id = "choice_14_4_1")
	 WebElement checkbox;
	
	
	@FindBy(id = "gform_submit_button_14")
	 WebElement submit;
	
	
	
	//Get Objects
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getCheckbox() {
		return checkbox;
	}
	
	public WebElement getSubmit() {
		return submit;
	}
	

}
